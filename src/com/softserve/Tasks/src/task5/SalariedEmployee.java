package task5;

public class SalariedEmployee extends Employee {
	String socialSecurityNumber;
	
	SalariedEmployee(String employeeId, String name, double fixedWage, double hourlyRate, double hours, String socialSecurityNumber)
	{
		super(employeeId, name, fixedWage, hourlyRate, hours);
		
		this.socialSecurityNumber = socialSecurityNumber;
	}
}