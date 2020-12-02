package com.myproject.factory;

import java.util.Random;

public class BaseSupplier<T> {
	private String name;
	private T warehouse;
	private int countProdution;
	
	public BaseSupplier(String name, T warehouse, int countProdution) {
		this.name = name;
		this.warehouse = warehouse;
		this.countProdution = countProdution;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public T getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(T warehouse) {
		this.warehouse = warehouse;
	}
	public int getCountProdution() {
		return countProdution;
	}
	public void setCountProdution(int countProdution) {
		this.countProdution = countProdution;
	}
	@Override
	public String toString() {
		return "Supplier [name=" + name + "]";
	}
	
	public int getRandomID() {
        Random random = new Random();
		return random.nextInt();
	}
}
