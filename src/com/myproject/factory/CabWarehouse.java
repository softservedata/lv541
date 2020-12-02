package com.myproject.factory;

import java.util.ArrayList;


public class CabWarehouse {
	private ArrayList<Cab> cabProvision;
	private final int maxNumberOfCab = 20;
	public CabWarehouse() {
		cabProvision = new ArrayList<>();
		
	}
	
	public synchronized void addToCabWarehouse(Cab someCab) {
		synchronized (AppMain.monitor) {
			if(cabProvision.size() < maxNumberOfCab) {
				AppMain.monitor.notify();
				cabProvision.add(someCab);	
				//System.out.println(cabProvision.size());
			}else {
				try {
					AppMain.monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public Cab getFromCabWarehouse() {
		synchronized (AppMain.monitor) {
			if(cabProvision.size() > 0) {
				AppMain.monitor.notify();
				Cab GetCab = cabProvision.get(0);
				cabProvision.remove(GetCab);
				return GetCab;
			}
			try {
				AppMain.monitor.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
}
