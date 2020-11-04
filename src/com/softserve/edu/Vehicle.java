package com.softserve.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;




public class Vehicle {
	
	public static void main(String[] args) {
		
		/* Car c1 = new Car(1992, "Porshe",300);
			System.out.println("Car number 1 = " + c1.getYearModel() + " ,make is = " + c1.getMake() + " ,speed is = " + c1.getSpeed());
		  
			Car c2= new Car(2015,"Renault",150);
		   System.out.println("Car number 2 = " + c2.getYearModel() + " ,make is = " + c2.getMake() + " ,speed is = " + c2.getSpeed());
		   
		   Car c3= new Car(2020,"BMW",250);
		   System.out.println("Car number 3 = " + c3.getYearModel() + " ,make is = " + c3.getMake() + " ,speed is = " + c3.getSpeed());

           Car c4= new Car(2018,"Volvo",200);
		   System.out.println("Car number 4 = " + c4.getYearModel()  + " ,make is = " + c4.getMake() + " ,speed is = " + c4.getSpeed()); */
		
		
		 ArrayList<Car> cars =new ArrayList<Car>();
		 Car obj1= new Car(1992, "Porshe",300);
		 Car obj2= new Car (2015,"Renault",150);
		 Car obj3 =new Car(2020,"BMW",250);
		 Car obj4 = new Car(2018,"Volvo",200);
		
		 cars.add(obj1);
		 cars.add(obj2);
		 cars.add(obj3);
		 cars.add(obj4);
		
		   
		 Collections.sort(cars);
		    Iterator i=cars.iterator();
		    while(i.hasNext()) {
		    	Car o1=(Car)i.next();
		    System.out.println("Year of a  Car is = "+ o1.getYearModel());
		    }
		    }
		   /* System.out.println(cars);
		   System.out.println(cars.size());
		   for (int i1=0; i1<cars.size(); i1++);
		   System.out.println(cars.get(2)); */ 
}




    



