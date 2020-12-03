package com.myproject.factory;

import java.util.ArrayList;

public class ¿ccessoriesWarehouse extends BaseWarehouse<¿ccessories>{

	public ¿ccessoriesWarehouse(int maxNumber) {
		super(maxNumber);
	}
	@Override
	public void addToWarehouse(Object some¿ccessor) {
		synchronized (AppMain.monitorForSupplier) {
			ArrayList<¿ccessories> Provisions = getProvision();
			if(Provisions.size() < getMaxNumber()) {
				AppMain.monitorForSupplier.notify();
				Provisions.add((¿ccessories)some¿ccessor);	
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
	
	@Override
	public ¿ccessories getFromWarehouse() {
		synchronized (AppMain.monitorForSupplier) {
			ArrayList<¿ccessories> Provisions = getProvision();
			if(Provisions.size() > 0) {
				AppMain.monitorForSupplier.notify();
				¿ccessories Get¿ccessor = Provisions.get(0);
				Provisions.remove(Get¿ccessor);
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
