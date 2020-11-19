package com.softserve.HomeWork6_1;


public abstract class Bird {
	private boolean feathers;
	private boolean layEgss;
	public abstract boolean fly();
	public Bird(boolean feathers, boolean layEgss) {
		this.feathers = feathers;
		this.layEgss = layEgss;
	}
	public boolean isFeathers() {
		return feathers;
	}
	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}
	public boolean isLayEgss() {
		return layEgss;
	}
	public void setLayEgss(boolean layEgss) {
		this.layEgss = layEgss;
	}
	
	

}
