package com.myproject.factory;

public class Cab {
	private int id;

	
	@Override
	public String toString() {
		return "Cab [id=" + id + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Cab(int id) {
		this.id = id;
	}
	

}
