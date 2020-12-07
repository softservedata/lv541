package com.myproject.factory;

public class CarProductionWorker implements Runnable{
	private final Worker currentWorker;
	private final Factory factory;

	@Override
	public void run() {
		//System.out.println("ddd");
		
		Car currentCar = new Car();
		Cab carCab = null;
		Engine carEngine = null;
		¿ccessories car¿ccessories = null;
		while (carCab == null || carEngine == null || car¿ccessories == null) {
			if(carCab == null) {
				carCab = factory.getWarehouseCab().getFromWarehouse();
				currentCar.setCarCab(carCab);
				AppMain.df.workerSetOutput(currentWorker,carCab);
			};
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(carEngine == null) {
				carEngine = factory.getWarehouseEngine().getFromWarehouse();
				currentCar.setCarEngine(carEngine);
				AppMain.df.workerSetOutput(currentWorker,carEngine);
			};
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(car¿ccessories == null) {
				car¿ccessories = factory.getWarehouse¿ccessories().getFromWarehouse();
				currentCar.setCar¿ccessor(car¿ccessories);
				AppMain.df.workerSetOutput(currentWorker,car¿ccessories);
			};
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
        }
		factory.getWarehouseCar().addToWarehouse(currentCar);
		AppMain.df.workerDeleteObject(currentWorker,carCab);
		AppMain.df.workerDeleteObject(currentWorker,carEngine);
		AppMain.df.workerDeleteObject(currentWorker,car¿ccessories);
		}

	public CarProductionWorker(Worker currentWorker, Factory factory) {
		this.currentWorker = currentWorker;
		this.factory = factory;
	}


	public Factory getFactory() {
		return factory;
	}


	public Worker getCurrentWorker() {
		return currentWorker;
	}
	

}
