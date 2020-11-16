package com.softserve.hometask5;

public class SalariedEmployee extends Employee implements CalcPay {
    private int hourlyPay;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int hourlyPay, int numberOfHoursWorked) {
        super(employeeId);
        this.hourlyPay = hourlyPay;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyPay * numberOfHoursWorked;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "hourlyPay=" + hourlyPay +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
