package com.myproject.factory;

import java.util.Random;


public class CabSupplier implements Runnable{
	private String name;
	private CabWarehouse Warehouse;
	private final int cabCount = 100;
	
	
	public CabSupplier(String name, CabWarehouse warehouse) {
		this.name = name;
		this.Warehouse = warehouse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cab supplier [name=" + name + "]";
	}
	@Override
	public void run() {
		
		// generate cabs
		int count = 0;
        while (count < cabCount) {
        	Cab nc = new Cab(getRandomID());
        	Warehouse.addToCabWarehouse(nc);
        	System.out.println("Provider "+name+" deliver "+nc);
            count++;
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
		
	}
	
	private int getRandomID() {
        Random random = new Random();
		return random.nextInt();
	}

}
