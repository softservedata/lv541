package com.softserve.HomeWork4_2;

import javax.management.loading.PrivateClassLoader;

/* -
  Declare enum for field breed.

Create 3 instances of type Dog.

Check if there is no two dogs with the same name.

Display the name and the kind of the oldest dog.
 */

public class Dog {
	private String name;
	private EnunTest breed;
	private int age;
	public Dog(String name, EnunTest breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EnunTest getBreed() {
		return breed;
	}
	public void setBreed(EnunTest breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Dog testDog = (Dog) obj;

		if (name != testDog.name) return false;

		//this point
		
		if (name == null) {
			if (testDog.name != null) return false;

		} else if (!name.equals(testDog.name)) {
			return true;
		}
		return true;
	}
	
	

}
