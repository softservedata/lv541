package com.softserve.HomeWork6_2;

public abstract class Employee implements MyInterface {
	private String employeeld;
	//public static double averageMonthlyWage;
	

	public Employee(String employeeld) {
		this.employeeld = employeeld;
	}


	public String getEmployeeld() {
		return employeeld;
	}


	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

}
