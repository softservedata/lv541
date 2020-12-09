package com.myproject.factory;


public class CarProductionWorker implements Runnable{
	private final Worker currentWorker;
	private final Factory factory;

	@Override
	public void run() {
		Thread.currentThread().setName("Making car ");
		//synchronized (AppMain.monitorController) {
			//if (factory.getWarehouseCar().getProvision().size() >= factory.getWarehouseCar().getMaxNumber()) {
			//	
			//	try {
			//		Thread.sleep(10);
			//	} catch (InterruptedException e) {
			//		e.printStackTrace();
			//	}
			//	
			//}
			//System.out.println("ddd");
			//AppMain.monitorController.notifyAll();
			Car currentCar = null;
			Cab carCab =null;
			Engine carEngine = null;
			¿ccessories car¿ccessories = null;
			
			while(currentCar == null) {
				//currentCar = new Car();

				
				while (carCab == null || carEngine == null || car¿ccessories == null) {
					
					if(carCab == null) {
						carCab = factory.getWarehouseCab().getFromWarehouse();
						if(carCab != null) {
							AppMain.df.workerSetOutput(currentWorker,carCab);
						}
						//if(carCab != null) {
						//	currentCar.setCarCab(carCab,currentWorker);
						//}
					};
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
					if(carEngine == null) {
						carEngine = factory.getWarehouseEngine().getFromWarehouse();
						if(carEngine != null) {
							AppMain.df.workerSetOutput(currentWorker,carEngine);
						}
						//if(carEngine != null) {
						//	currentCar.setCarEngine(carEngine,currentWorker);
						//}
					};
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(car¿ccessories == null) {
						car¿ccessories = factory.getWarehouse¿ccessories().getFromWarehouse();
						if(car¿ccessories != null) {
							AppMain.df.workerSetOutput(currentWorker,car¿ccessories);
						}
						//if(car¿ccessories != null) {
						//	currentCar.setCar¿ccessor(car¿ccessories,currentWorker);
						//}
					};
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				currentCar =new Car(carEngine,carCab,car¿ccessories);
				synchronized(AppMain.monitorController) {
					System.out.println(AppMain.carNumber);
					AppMain.carNumber = AppMain.carNumber + 1;
					
				}
				factory.getWarehouseCar().addToWarehouse(currentCar);
				AppMain.df.workerDeleteObject(currentWorker,currentCar.getCarCab());
				AppMain.df.workerDeleteObject(currentWorker,currentCar.getCarEngine());
				AppMain.df.workerDeleteObject(currentWorker,currentCar.getCar¿ccessor());
				currentCar = null;
				carCab =null;
				carEngine = null;
				car¿ccessories = null;
				//try {
				//	currentWorker.getMonitorController().wait();
				//} catch (InterruptedException e) {
				//	e.printStackTrace();
				//}
			}
		//}
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
