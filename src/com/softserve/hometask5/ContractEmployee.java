package com.softserve.hometask5;

public class ContractEmployee extends Employee implements CalcPay {
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, int fixedMonthlyPayment) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }
}
