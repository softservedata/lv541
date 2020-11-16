package com.softserve.hometask5;

public class Employee implements CalcPay {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
