package com.myproject.factory;


public class Dealer implements Runnable{
	private String name;
	private CarWarehouse warehoouse;
	private int sleepTime;
	
	public Dealer(String name, CarWarehouse warehoouse, int sleepTime) {
		this.name = name;
		this.warehoouse = warehoouse;
		this.sleepTime = sleepTime;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public CarWarehouse getWarehoouse() {
		return warehoouse;
	}


	public void setWarehoouse(CarWarehouse warehoouse) {
		this.warehoouse = warehoouse;
	}


	@Override
	public void run() {
		Thread.currentThread().setName("Dealer "+getName());
		while (true) {
            try {
                //Time to load the goods
                Thread.sleep(sleepTime);
                Car car = warehoouse.getFromWarehouse();
                if(car!=null) {
                	warehoouse.deleteFromWarehouse(car);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
	}

}
