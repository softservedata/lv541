package com.myproject.factory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller implements Runnable{
	private final Factory myFactory = new Factory();

	@Override
	public void run() {
		// generate cabs
		int count = 0;
		while (count < myFactory.getWarehouseCar().getMaxNumber()) {
			ExecutorService serviceForProduction = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			for(CarProductionWorker production : myFactory.getProduction()) {
				serviceForProduction.execute(production);	
			}
			serviceForProduction.shutdown();
			count++;
		}
	}

}
