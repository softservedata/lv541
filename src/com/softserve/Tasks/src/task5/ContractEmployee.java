package task5;

public class ContractEmployee extends Employee {
	String federalTaxIdmember;
	
	ContractEmployee(String employeeId, String name, double fixedWage, double hourlyRate, double hours, String federalTaxIdmember)
	{
		super(employeeId, name, fixedWage, hourlyRate, hours);
		this.federalTaxIdmember = federalTaxIdmember;
	}
}