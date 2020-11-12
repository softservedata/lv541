package com.softserve.edu.empoyee;

public class SalariedEmployee extends Employee {       // implements Calculate
    private String socialSecurityNumber;
    private int fixedMonthlyPayment;
                                                         // чи потрібно дефолтний конструктор

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeId, name);
        setSocialSecurityNumber(socialSecurityNumber);
        setFixedMonthlyPayment(fixedMonthlyPayment);
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                "} " + super.toString();
    }
}
