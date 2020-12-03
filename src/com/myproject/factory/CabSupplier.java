package com.myproject.factory;


public class CabSupplier extends BaseSupplier<CabWarehouse> implements Runnable{
	
	public CabSupplier(String name, CabWarehouse warehouse, int countProdution) {
		super(name, warehouse, countProdution);
	}

	@Override
	public String toString() {
		return "Cab supplier [name=" + getName() + "]";
	}
	
	@Override
	public void run() {
		
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	Cab nc = new Cab(getRandomID());
        	CabWarehouse Warehouse = (CabWarehouse) getWarehouse();
 
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
