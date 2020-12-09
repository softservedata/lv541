package com.myproject.factory;

public class EngineSupplier extends BaseSupplier<EngineWarehouse> implements Runnable{
	
	public EngineSupplier(String name, EngineWarehouse warehouse, int countProdution) {
		super(name, warehouse, countProdution);
	}

	@Override
	public String toString() {
		return "Engine supplier " + getName();
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Engine Supplier "+getName());
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	//Engine nc = new Engine(this);
        	Engine nc = new Engine(this,count);
        	EngineWarehouse Warehouse = (EngineWarehouse) getWarehouse();
 
        	if(Warehouse.addToWarehouse(nc)){
        		count++;
        		try {
        			Thread.sleep(100);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
        	}
        }
		
	}
	
}
