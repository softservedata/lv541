package com.softserve.HomeWork6_1;

public class Eagle extends FlyingBird {

	public Eagle( String subspecies) {
		super(true, true, 75, subspecies,"Eagle");
	}

	@Override
	public String toString() {
		return "Eagle --- [ MaxDistance: " + getMaxDistanceToFly() + ", can fly: " + fly() + ", have feathers: "
				+ isFeathers() + ", Lay Egss: " + isLayEgss() +", subspecies"+getSubspecies()+"]";
		//return "Eagle [MaxDistance^" + getMaxDistanceToFly() + ", can fly^" + fly() + ", have feathers:"
		//+ isFeathers() + ", Lay Egss: " + isLayEgss() + ", getClass()=" + getClass() + ", hashCode()="
		//+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
