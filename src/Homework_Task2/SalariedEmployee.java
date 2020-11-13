package Homework_Task2;

public class SalariedEmployee extends Employee implements PayMethod{
private double FixedSalary;
private String  federalTaxIdmember;


	
public SalariedEmployee(String employeeId, String name, double getSalary, int hours, double fixedSalary,
		String federalTaxIdmember) {
	super(employeeId, name, getSalary, hours);
	FixedSalary = 5000;
	federalTaxIdmember = "";
}


public double getFixedSalary() {
	return FixedSalary;
}


public void setFixedSalary(double fixedSalary) {
	FixedSalary = fixedSalary;
}


public String getFederalTaxIdmember() {
	return federalTaxIdmember;
}


public void setFederalTaxIdmember(String federalTaxIdmember) {
	this.federalTaxIdmember = federalTaxIdmember;
}



	@Override
	public double calculatePay() {
		return 0;
	}


	@Override
	public String toString() {
		return "SalariedEmployee [FixedSalary=" + FixedSalary + ", federalTaxIdmember=" + federalTaxIdmember + "]";
	}

}
