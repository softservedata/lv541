package com.softserve.edu;

public class Worker {
	public static void main(String[] args) {
		
		Employee wr1 =new Employee("Bohdan", 30, 500, 40);
		System.out.println("name = " + wr1.getName() + " age = " + wr1.getAge() + " salary = " + wr1.getSalary() + " hours = " + wr1.getHours());
		
		Employee wr2 =new Employee("Olia", 25, 600, 35);
		System.out.println("name = " + wr2.getName() + " age = " + wr2.getAge() + " salary = " + wr2.getSalary() + " hours = " + wr2.getHours());
	System.out.println("Object count " + Employee.getCount());
	}

}
