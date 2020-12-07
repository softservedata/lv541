package com.myproject.factory;

import java.util.ArrayList;

public class Factory {
	private final EngineWarehouse warehouseEngine;
	private final ¿ccessoriesWarehouse Warehouse¿ccessories;
	private final CabWarehouse WarehouseCab;
	private final CarWarehouse WarehouseCar;
	private final ArrayList<Worker> workers;
	private final ArrayList<CarProductionWorker> production;
	
	
	public ArrayList<CarProductionWorker> getProduction() {
		return production;
	}

	public Factory() {
		warehouseEngine = new EngineWarehouse(30);
		Warehouse¿ccessories = new ¿ccessoriesWarehouse(40);
		WarehouseCab = new CabWarehouse(20);
		WarehouseCar = new CarWarehouse(20);
		workers = new ArrayList<Worker>();
		workers.add(new Worker("Ivan",1));
		workers.add(new Worker("Petro",2));
		workers.add(new Worker("Dmytro",3));
		production = new ArrayList<CarProductionWorker>();
		for (Worker w : workers) {
			production.add(new CarProductionWorker(w,this));	
		}
		
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

	
}
