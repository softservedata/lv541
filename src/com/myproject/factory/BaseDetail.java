package com.myproject.factory;

public abstract class BaseDetail<T> {

	private int id;
	private T Supplier;


	public T getSupplier() {
		return Supplier;
	}


	public void setSupplier(T supplier) {
		Supplier = supplier;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public BaseDetail(T supplier) {
		this.id = getRandomID();
		this.Supplier = supplier;
	}
	
	public BaseDetail(T supplier, int id) {
		this.id = id;
		this.Supplier = supplier;
	}
	
	public int getRandomID() {
        //Random random = new Random();
		return (int) (1000+Math.random()*5000);
	}
}
