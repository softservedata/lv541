package com.myproject.factory;


public class CabSupplier extends BaseSupplier<CabWarehouse> implements Runnable{
	
	public CabSupplier(String name, CabWarehouse warehouse, int countProdution) {
		super(name, warehouse, countProdution);
	}

	@Override
	public String toString() {
		//return "Cab supplier [name=" + getName() + "]";
		return "Cab supplier " + getName() ;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Cab Supplier "+getName());
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	//Cab nc = new Cab(this);
        	Cab nc = new Cab(this,count);
        	CabWarehouse Warehouse = (CabWarehouse) getWarehouse();
 
        	if(Warehouse.addToWarehouse(nc)) {
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
