package com.myproject.factory;

import java.util.Random;

public class Supplier implements Runnable{
	private String name;
	private ÀccessoriesWarehouse Warehouse;
	private final int AccCount = 100;
	
	
	public Supplier(String name, ÀccessoriesWarehouse warehouse) {
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
		return "Supplier [name=" + name + "]";
	}
	@Override
	public void run() {
		
		// generate cabs
		int count = 0;
        while (count < AccCount) {
        	Àccessories nc = new Àccessories(getRandomID());
        	Warehouse.addToÀccessoriesWarehouse(nc);
        	System.out.println(name+" deliver "+nc);
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
