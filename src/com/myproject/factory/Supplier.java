package com.myproject.factory;

import java.util.Random;

public class Supplier extends BaseSupplier<�ccessoriesWarehouse>  implements Runnable{

	public Supplier(String name, �ccessoriesWarehouse warehouse, int countProdution) {
		super(name, warehouse, countProdution);
	}
	@Override
	public String toString() {
		return "Supplier [name=" + getName() + "]";
	}
	@Override
	public void run() {
		
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	�ccessories nc = new �ccessories(getRandomID());    	
        	�ccessoriesWarehouse Warehouse = (�ccessoriesWarehouse) getWarehouse();
        	Warehouse.addToWarehouse(nc);
        	
        	System.out.println(getName()+" deliver "+nc);
            count++;
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
		
	}

}
