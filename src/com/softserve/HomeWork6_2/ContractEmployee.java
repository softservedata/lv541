package com.softserve.HomeWork6_2;

public class ContractEmployee extends Employee implements MyInterface  {
	private int numberOfHoursWorked;
	private double hourlyRate;
	private String federalTaxIdmember;

	public ContractEmployee(String employeeld, int numberOfHoursWorked, double hourlyRate, String federalTaxIdmember) {
		super(employeeld);
		setNumberOfHoursWorked(numberOfHoursWorked);
		setHourlyRate(hourlyRate);
		setFederalTaxIdmember(federalTaxIdmember);
	}

	
	
	@Override
	public String toString() {
		return "ID =" + getNumberOfHoursWorked() + ", Name=" + getEmployeeld();
	}



	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}



	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}



	public double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate > 0) {
			this.hourlyRate = hourlyRate;
		}else {
			throw new IllegalArgumentException("tariff must be >0!");
		}
	}


	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		if(numberOfHoursWorked > 0) {
			this.numberOfHoursWorked = numberOfHoursWorked;
		}else {
			throw new IllegalArgumentException("hours must be >0!");
		}
	}

	@Override
	public double calculatePay() {
		return numberOfHoursWorked * hourlyRate;
	}

}
