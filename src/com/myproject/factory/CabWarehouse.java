package com.myproject.factory;

import java.util.ArrayList;


public class CabWarehouse extends BaseWarehouse<Cab>{

	public CabWarehouse(int maxNumber) {
		super(maxNumber);
	}
	
	@Override
	public void addToWarehouse(Object someCab) {

		synchronized (AppMain.monitor) {
			
			ArrayList<Cab> Provisions = getProvision();

			if(Provisions.size() < getMaxNumber()) {
			//if(true) {
				AppMain.monitor.notify();
				Provisions.add((Cab)someCab);	
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
	@Override
	public Cab getFromWarehouse() {
		synchronized (AppMain.monitor) {
			ArrayList<Cab> provisions = getProvision();
			if(provisions.size() > 0) {
				AppMain.monitor.notify();
				Cab GetCab = provisions.get(0);
				provisions.remove(GetCab);
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
