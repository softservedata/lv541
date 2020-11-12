package Homework_Task2;

public class ContractEmployee extends Employee implements PayMethod{
 private int hoursWorked;
 private double ratePerHour;
private String socialSecurityNumber;
 



public ContractEmployee(String employeeId, String name, double getSalary, int hours, int hoursWorked,
		double ratePerHour, String socialSecurityNumber) {
	super(employeeId, name, getSalary, hours);
    hoursWorked = 0;
	this.ratePerHour = 20.5;
	this.socialSecurityNumber = "";
}


public int getHoursWorked() {
	return hoursWorked;
}


public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
}

public double getRatePerHour() {
	return ratePerHour;
}


public void setRatePerHour(double ratePerHour) {
	this.ratePerHour = ratePerHour;
}


public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}


public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}


public void addHours(double newHours) {
    hoursWorked = (int) (hoursWorked + newHours);
  }

  @Override
public double calculatePay() {
	if ( hoursWorked <=40) {
		return ratePerHour * hoursWorked;
	} else {
	      return ratePerHour *40.0 + 1.5 * ratePerHour *(hoursWorked-40.0);
	    }
	  }


@Override
public String toString() {
	return "SalariedEmployee (Name = " + getName() + " , id = " 
+ getEmployeeId() + " , hourly pay = " + ratePerHour + ", hours worked " + hoursWorked + " getSocialSecurityNumber =" 
			+ getSocialSecurityNumber() + ")";
	
	
}
	
} 



