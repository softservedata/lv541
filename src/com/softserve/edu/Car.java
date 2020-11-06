package com.softserve.edu;

import java.util.Objects;

public class Car {
	 private String type;
	 private long yearOfProduction;;
	 private double engineCapacity;
	
	 //  COnstructor 
	 public Car(String type, long yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(long yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	  @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Car car = (Car) o;
	        return type.equals(car.type);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(type);
	    }

	    @Override
	    public String toString() {
	        return "Car: " +
	                " type='" + type + '\'' +
	                ", yearOfProduction=" + yearOfProduction +
	                ", engineCapacity=" + engineCapacity;
	    }
	}
	
	



