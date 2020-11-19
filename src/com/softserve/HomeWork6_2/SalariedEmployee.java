package com.softserve.HomeWork6_2;

public class SalariedEmployee extends Employee implements MyInterface  {
	private double salary;
	private String socialSecurityNumber;
	public SalariedEmployee(String employeeld,double salary,String socialSecurityNumber) {
		super(employeeld);
		setSalary(salary);
		setSocialSecurityNumber(socialSecurityNumber);
	}
	

	
	@Override
	public String toString() {
		return "ID =" + getSocialSecurityNumber() + ", Name=" + getEmployeeld();
	}

	public double getSalary() {
		return salary;
	}

	

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public void setSalary(double salary) {
		if(salary > 0) { 
			this.salary = salary;
		}else {
			throw new IllegalArgumentException("salary must be >0!");
		}
	}


	@Override
	public double calculatePay() {
		return salary;
	}

}
