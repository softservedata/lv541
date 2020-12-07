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
		
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	Engine nc = new Engine(this);
        	EngineWarehouse Warehouse = (EngineWarehouse) getWarehouse();
 
        	Warehouse.addToWarehouse(nc);
        	//System.out.println("Provider "+getName()+" deliver "+nc);
            count++;
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
		
	}
	
}
