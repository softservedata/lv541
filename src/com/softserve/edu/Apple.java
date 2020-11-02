package com.softserve.edu;
import java.util.Scanner;
public class Apple {
	enum Breed {
	    CORGI ,
		AKITA ,
		SHEPHERD ,
		WESTIE;
		}

	public static void main(String[] args) {
		for(Breed dogs: Breed.values());
		Breed breed;
		breed =Breed.AKITA;
		System.out.println(" breed = " + breed.name());
		System.out.println(" breed.name() = " + breed.name());
		
		Dog d1 =new Dog("Archie", 5, "CORGI");
		System.out.println("name = " + d1.getName() + " age = " + d1.getAge() + " breed = " +d1.getBreed());
		
		Dog d2 =new Dog("Leslie", 2, "WESTIE");
		System.out.println("name = " + d2.getName() + " age = " + d2.getAge() + " breed = " + d2.getBreed());
		
		Dog d3 = new Dog("Phern", 6, "SHEPHERD");
		System.out.println(" name = " + d3.getName() + " age = " + d3.getAge() + " breed = " + d3.getBreed());
	    for(Breed current : Breed.values()) {
	    	System.out.println(" current = " + current);
	    	
	    	// Comparison 
	    	Scanner keyboard = new Scanner (System.in);
	   
	    	
	        System.out.println(" d1.equals (d2) : " + d1.equals(d2));
	    	System.out.println(" d1.hashCode() = " + d1.hashCode());
	    	System.out.println(" d1.hashCode() = " + d1.hashCode());
	    }
	    	    
	}

}
