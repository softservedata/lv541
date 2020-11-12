package com.softserve.edu.empoyee;

public class ContractEmployee extends Employee {    // implements Calculate
    private String federalTaxIdMember;
    private int hourlyRate;
    private int numberOfHoursWorked;
                                                      // чи потрібно дефолтний конструктор
    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, int hourlyRate, int numberOfHoursWorked) {
       super(employeeId, name);
       setFederalTaxIdMember(federalTaxIdMember);
       setHourlyRate(hourlyRate);                            // чи є різниця як писати: через set, через this
       setNumberOfHoursWorked(numberOfHoursWorked);
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                "} " + super.toString();
    }
}
