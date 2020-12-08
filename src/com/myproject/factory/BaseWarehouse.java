package com.myproject.factory;

import java.util.ArrayList;

//public class BaseWarehouse<T> implements ModifyWarehouseInterface{
public class BaseWarehouse<T>{
	private ArrayList<T> provision;
	private int maxNumber;
	private final Object monitor;
	
	public BaseWarehouse(int maxNumber) {
		monitor = new Object();
		this.maxNumber = maxNumber;
		provision = new ArrayList<T>();
		
	}
	public ArrayList<T> getProvision() {
		return provision;
	}
	public void setProvision(ArrayList<T> provision) {
		this.provision = provision;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public Object getMonitor() {
		return monitor;
	}

	public void addToWarehouse(T someObject) {
		synchronized (monitor) {

			if(provision.size() < maxNumber) {
				monitor.notify();
				if (provision.add(someObject)){
					AppMain.df.setOutput(someObject);
				}

			}else {
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}


	public void deleteFromWarehouse(T someObject) {
		if(provision.remove(someObject)){	
			AppMain.df.remove(someObject);
		}
		
	}
	
	public T getFromWarehouse() {
		synchronized (monitor) {
			if(provision.size() > 0) {
				monitor.notify();
				T getObject = provision.get(0);
				if(provision.remove(getObject)) {
					AppMain.df.remove(getObject);
				}
				return getObject;
			}
			try {
				monitor.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
