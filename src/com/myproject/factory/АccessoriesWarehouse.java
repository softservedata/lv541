package com.myproject.factory;

import java.util.ArrayList;

public class ¿ccessoriesWarehouse extends BaseWarehouse<¿ccessories>{

	public ¿ccessoriesWarehouse(int maxNumber) {
		super(maxNumber);
	}
	@Override
	public void addToWarehouse(Object some¿ccessor) {
		synchronized (AppMain.monitor¿ccessor) {
			ArrayList<¿ccessories> Provisions = getProvision();
			if(Provisions.size() < getMaxNumber()) {
				AppMain.monitor¿ccessor.notify();
				Provisions.add((¿ccessories)some¿ccessor);
				AppMain.df.accessoriesSetOutput((¿ccessories)some¿ccessor);
			}else {
				try {
					AppMain.monitor¿ccessor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Override
	public ¿ccessories getFromWarehouse() {
		synchronized (AppMain.monitor¿ccessor) {
			ArrayList<¿ccessories> Provisions = getProvision();
			if(Provisions.size() > 0) {
				AppMain.monitor¿ccessor.notify();
				¿ccessories Get¿ccessor = Provisions.get(0);
				Provisions.remove(Get¿ccessor);
				AppMain.df.accessoriesRemove(Get¿ccessor);
				return Get¿ccessor;
			}
			try {
				AppMain.monitor¿ccessor.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}

	@Override
	public void deleteFromWarehouse(Object some¿ccessor) {
		getProvision().remove(some¿ccessor);
		AppMain.df.accessoriesRemove((¿ccessories)some¿ccessor);		
	}
}
