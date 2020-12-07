package com.myproject.factory;

import java.util.ArrayList;

public class CarWarehouse extends BaseWarehouse<Car>{
	public CarWarehouse(int maxNumber) {
		super(maxNumber);
	}

	@Override
	public void addToWarehouse(Object someCar) {
		synchronized (AppMain.monitorCar) {
			
			ArrayList<Car> Provisions = getProvision();

			if(Provisions.size() < getMaxNumber()) {
				AppMain.monitorCar.notify();
				Provisions.add((Car)someCar);	
				AppMain.df.carSetOutput((Car)someCar);

			}else {
				try {
					AppMain.monitorCar.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Car getFromWarehouse() {
		synchronized (AppMain.monitorCar) {
			ArrayList<Car> provisions = getProvision();
			if(provisions.size() > 0) {
				AppMain.monitorCar.notify();
				Car GetCar= provisions.get(0);
				provisions.remove(GetCar);
				AppMain.df.carRemove(GetCar);
				return GetCar;
			}
			try {
				AppMain.monitorCar.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	

	@Override
	public void deleteFromWarehouse(Object someCar) {
		getProvision().remove(someCar);
		AppMain.df.carRemove((Car)someCar);
		
	}

}
