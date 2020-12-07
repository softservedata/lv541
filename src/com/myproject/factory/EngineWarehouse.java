package com.myproject.factory;

import java.util.ArrayList;

public class EngineWarehouse extends BaseWarehouse<Engine>{
	public EngineWarehouse(int maxNumber) {
		super(maxNumber);
	}
	
	@Override
	public void addToWarehouse(Object someCab) {

		synchronized (AppMain.monitorEngine) {
			
			ArrayList<Engine> Provisions = getProvision();

			if(Provisions.size() < getMaxNumber()) {
			//if(true) {
				AppMain.monitorEngine.notify();
				Provisions.add((Engine)someCab);	
				AppMain.df.engineSetOutput((Engine)someCab);

			}else {
				try {
					AppMain.monitorEngine.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	@Override
	public Engine getFromWarehouse() {
		synchronized (AppMain.monitorEngine) {
			ArrayList<Engine> provisions = getProvision();
			if(provisions.size() > 0) {
				AppMain.monitorEngine.notify();
				Engine GetEngine = provisions.get(0);
				provisions.remove(GetEngine);
				AppMain.df.engineRemove(GetEngine);
				return GetEngine;
			}
			try {
				AppMain.monitorEngine.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	@Override
	public void deleteFromWarehouse(Object someEngine) {
		getProvision().remove(someEngine);
		AppMain.df.engineRemove((Engine)someEngine);	
	}

}
