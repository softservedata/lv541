package com.softserve.myproject;

public class Spoon {
	private int number;
	private boolean availability = true;
	

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Spoon(int number) {
		super();
		this.number = number;
	}
	
	public void take() {
		availability = false;
		System.out.println("Take "+number+" spoon");
	}
	
	public void put() {
		availability = true;
		System.out.println("Put "+number+" spoon");
	}
	

}
