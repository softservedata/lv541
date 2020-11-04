package com.softserve.edu;

import java.util.ArrayList;
import java.util.Collections;
public class Vehicle {
	
	public static void main(String[] args) {
		
		
		 ArrayList<String> cars =new ArrayList<String>();
		 
		    cars.add("Porshe");
		    cars.add("Renault");
		    cars.add("BMW");
		    cars.add("Volvo");
		    Collections.sort(cars);
		    for (String i : cars) {
		    	System.out.println(i);
		     
		    	
		    }
		   System.out.println(cars);
		   System.out.println(cars.size());
		   for (int i=0; i<cars.size(); i++);
		   System.out.println(cars.get(2));
	
	    Car c1 = new Car(1992, "Porshe",300);
		System.out.println("Car number 1 = " + c1.getYearModel() + " ,make is = " + c1.getMake() + " ,speed is = " + c1.getSpeed());
	   Car c2= new Car(2015,"Renault",150);
	   System.out.println("Car number 2 = " + c2.getYearModel() + " ,make is = " + c2.getMake() + " ,speed is = " + c2.getSpeed());
	   Car c3= new Car(2020,"BMW",250);
	   System.out.println("Car number 3 = " + c3.getYearModel() + " ,make is = " + c3.getMake() + " ,speed is = " + c3.getSpeed());
	   Car c4= new Car(2018,"Volvo",200);
	   System.out.println("Car number 4 = " + c4.getYearModel()  + " ,make is = " + c4.getMake() + " ,speed is = " + c4.getSpeed());
	
	    }
	}


