package com.myproject.factory;

public class Worker {
	private String name;
	private int ID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + "]";
	}

	public Worker(String name,int ID) {
		this.name = name;
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	

}
