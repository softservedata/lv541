package com.myproject.factory;

import java.util.ArrayList;

public class ¿ccessoriesWarehouse{

	private ArrayList<¿ccessories> ¿ccessoriesProvision;
	private final int maxNumberOf¿ccessories = 40;
	
	public ¿ccessoriesWarehouse(){
		¿ccessoriesProvision = new ArrayList<>();
		
	}
	
	public void addTo¿ccessoriesWarehouse(¿ccessories some¿ccessor) {
		synchronized (AppMain.monitorForSupplier) {
			if(¿ccessoriesProvision.size() < maxNumberOf¿ccessories) {
				AppMain.monitorForSupplier.notify();
				¿ccessoriesProvision.add(some¿ccessor);	
				//System.out.println(¿ccessoriesProvision.size());
			}else {
				try {
					AppMain.monitorForSupplier.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public ¿ccessories getFromCabWarehouse() {
		synchronized (AppMain.monitorForSupplier) {
			if(¿ccessoriesProvision.size() > 0) {
				AppMain.monitorForSupplier.notify();
				¿ccessories Get¿ccessor = ¿ccessoriesProvision.get(0);
				¿ccessoriesProvision.remove(Get¿ccessor);
				return Get¿ccessor;
			}
			try {
				AppMain.monitorForSupplier.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
}
