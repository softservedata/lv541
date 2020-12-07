package com.myproject.factory;


public class Controller implements Runnable{
	private final Factory myFactory = new Factory();

	@Override
	public void run() {
		// generate cabs
		int count = 0;
		while (count < myFactory.getWarehouseCar().getMaxNumber()) {
			//AppMain.monitorController.notifyAll();
			//ExecutorService serviceForProduction = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			//for(CarProductionWorker production : myFactory.getProduction()) {
			//	serviceForProduction.execute(production);	
			//}
			//serviceForProduction.shutdown();
			
			count++;
		}
	}

}
