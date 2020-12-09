package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Factory {
	private final EngineWarehouse warehouseEngine;
	private final ¿ccessoriesWarehouse Warehouse¿ccessories;
	private final CabWarehouse WarehouseCab;
	private final CarWarehouse WarehouseCar;
	private final ArrayList<Worker> workers;
	//private final ArrayList<CarProductionWorker> production;
	
	

	public Factory() {
		warehouseEngine = new EngineWarehouse(10);
		Warehouse¿ccessories = new ¿ccessoriesWarehouse(11);
		WarehouseCab = new CabWarehouse(12);
		WarehouseCar = new CarWarehouse(4);
		workers = new ArrayList<Worker>();
		workers.add(new Worker("Ivan",1,this));
		workers.add(new Worker("Petro",2,this));
		workers.add(new Worker("Dmytro",3,this));
		//production = new ArrayList<CarProductionWorker>();
		//for (Worker w : workers) {
		//	production.add(new CarProductionWorker(w,this));	
		//}
		
	}
	
	public EngineWarehouse getWarehouseEngine() {
		return warehouseEngine;
	}

	public ¿ccessoriesWarehouse getWarehouse¿ccessories() {
		return Warehouse¿ccessories;
	}
	
	public CabWarehouse getWarehouseCab() {
		return WarehouseCab;
	}
	
	public ArrayList<Worker> getWorkers() {
		return workers;
	}

	public CarWarehouse getWarehouseCar() {
		return WarehouseCar;
	}
	
	public void startProduction() {
		//synchronized (AppMain.monitorController) {
			ExecutorService serviceForProduction = Executors.newFixedThreadPool(3);
			for(Worker production : workers) {
				serviceForProduction.execute(production);	
			}
			serviceForProduction.shutdown();
		//}

	}

	
}
