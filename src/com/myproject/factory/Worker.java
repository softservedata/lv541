package com.myproject.factory;

public class Worker implements Runnable{
	private String name;
	private int ID;
	private final Factory factory;


	public Factory getFactory() {
		return factory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + "]";
	}

	public Worker(String name,int ID, Factory factory) {
		this.name = name;
		this.ID = ID;
		this.factory = factory;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public void run(){
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
							AppMain.df.workerSetOutput(this,carCab);
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
							AppMain.df.workerSetOutput(this,carEngine);
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
							AppMain.df.workerSetOutput(this,car¿ccessories);
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
				AppMain.df.workerDeleteObject(this,currentCar.getCarCab());
				AppMain.df.workerDeleteObject(this,currentCar.getCarEngine());
				AppMain.df.workerDeleteObject(this,currentCar.getCar¿ccessor());
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
	
	

}
