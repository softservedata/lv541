package com.myproject.factory;

import java.util.ArrayList;


public class CabWarehouse extends BaseWarehouse<Cab>{

	public CabWarehouse(int maxNumber) {
		super(maxNumber);
	}
	
	@Override
	public void addToWarehouse(Object someCab) {

		synchronized (AppMain.monitorCab) {
			
			ArrayList<Cab> Provisions = getProvision();

			if(Provisions.size() < getMaxNumber()) {
			//if(true) {
				AppMain.monitorCab.notify();
				Provisions.add((Cab)someCab);	
				AppMain.df.cabSetOutput((Cab)someCab);

			}else {
				try {
					AppMain.monitorCab.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Override
	public Cab getFromWarehouse() {
		synchronized (AppMain.monitorCab) {
			ArrayList<Cab> provisions = getProvision();
			if(provisions.size() > 0) {
				AppMain.monitorCab.notify();
				Cab GetCab = provisions.get(0);
				provisions.remove(GetCab);
				AppMain.df.cabRemove(GetCab);
				return GetCab;
			}
			try {
				AppMain.monitorCab.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	@Override
	public void deleteFromWarehouse(Object someCab) {
		getProvision().remove(someCab);
		AppMain.df.cabRemove((Cab)someCab);
		
	}

}
