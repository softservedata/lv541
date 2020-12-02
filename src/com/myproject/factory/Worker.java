package com.myproject.factory;

public class Worker {
	private String name;

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

	public Worker(String name) {
		super();
		this.name = name;
	}
	

}
