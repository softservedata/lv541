package com.softserve.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;



public class Vehicle {
	
	public static void main(String[] args) {

		Car car = new Car ( type "Porshe", )
		 
		ArrayList<Car> cars =new ArrayList<Car>();
		 Car obj1= new Car(1992, "Porshe",300);
		 Car obj2= new Car (2015,"Renault",150);
		 Car obj3 =new Car(2020,"BMW",250);
		 Car obj4 = new Car(2018,"Volvo",200);
		
		 cars.add(obj1);
		 cars.add(obj2);
		 cars.add(obj3);
		 cars.add(obj4);
		
		   // як посортувати філди по роках?
		 
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




    



