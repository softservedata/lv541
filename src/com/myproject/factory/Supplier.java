package com.myproject.factory;


public class Supplier extends BaseSupplier<�ccessoriesWarehouse>  implements Runnable{

	public Supplier(String name, �ccessoriesWarehouse warehouse, int countProdution) {
		super(name, warehouse, countProdution);
	}
	@Override
	public String toString() {
		return getName();
	}
	@Override
	public void run() {
		Thread.currentThread().setName("�ccessories Supplier "+getName());
		// generate cabs
		int count = 0;
        while (count < getCountProdution()) {
        	//�ccessories nc = new �ccessories(this); 
        	�ccessories nc = new �ccessories(this,count);  	
        	�ccessoriesWarehouse Warehouse = (�ccessoriesWarehouse) getWarehouse();
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
