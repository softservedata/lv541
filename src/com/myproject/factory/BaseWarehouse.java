package com.myproject.factory;

import java.util.ArrayList;

public abstract class BaseWarehouse<T> implements ModifyWarehouseInterface{
	private ArrayList<T> Provision;
	private int maxNumber;
	
	public ArrayList<T> getProvision() {
		return Provision;
	}
	public void setProvision(ArrayList<T> provision) {
		Provision = provision;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public BaseWarehouse(int maxNumber) {
		Provision = new ArrayList<>();
		this.maxNumber = maxNumber;
		
	}
	
}
