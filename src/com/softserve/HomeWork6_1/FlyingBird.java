package com.softserve.HomeWork6_1;

public class FlyingBird extends Bird {
	private double maxDistanceToFly;
	private String subspecies;
	private String name;
	
	@Override
	public String toString() {
		return ""+getName()+" [ MaxDistance: " + getMaxDistanceToFly() + ", can fly: " + fly() + ", have feathers: "
				+ isFeathers() + ", Lay Egss: " + isLayEgss() +", subspecies"+getSubspecies()+"]";
		//return "Eagle [MaxDistance^" + getMaxDistanceToFly() + ", can fly^" + fly() + ", have feathers:"
		//+ isFeathers() + ", Lay Egss: " + isLayEgss() + ", getClass()=" + getClass() + ", hashCode()="
		//+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public FlyingBird(boolean feathers, boolean layEgss,double distanceToFly, String subspecies,String name) {
		super(feathers, layEgss);
		this.maxDistanceToFly = distanceToFly;
		this.subspecies = subspecies;
		this.name = name;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubspecies() {
		return subspecies;
	}


	public void setSubspecies(String subspecies) {
		this.subspecies = subspecies;
	}


	public double getMaxDistanceToFly() {
		return maxDistanceToFly;
	}

	public void setMaxDistanceToFly(double maxDistanceToFly) {
		this.maxDistanceToFly = maxDistanceToFly;
	}


	@Override
	public boolean fly() {
		return true;
	}

}
