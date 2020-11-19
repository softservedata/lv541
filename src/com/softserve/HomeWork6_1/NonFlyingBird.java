package com.softserve.HomeWork6_1;

public class NonFlyingBird extends Bird {
	private String area;
	private String Name;

	public NonFlyingBird(boolean feathers, boolean layEgss,String area,String Name) {
		super(feathers, layEgss);
		this.area = area;
		this.Name = Name;
	}

	@Override
	public boolean fly() {
		return false;
		
	}
	


	@Override
	public String toString() {
		return ""+getName()+" [area=" + area + ", fly()=" + fly() + ", getArea()=" + getArea() + ", isFeathers()="
				+ isFeathers() + ", isLayEgss()=" + isLayEgss() + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}
