package task5;

public class Employee implements IPayment, Comparable{
	public String employeeId;
	public String name;
	public double fixedWage = 0.0;
	public double hourlyRate = 0.0;
	public double hours = 0.0;
	
	Employee(String employeeId, String name, double fixedWage, double hourlyRate, double hours)
	{
		this.employeeId = employeeId;
		this.name = name;
		this.fixedWage = fixedWage;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	@Override
	public double calculatePay() {
		return this.fixedWage > 0.0 ? this.fixedWage : this.hourlyRate * this.hours;
	}
	
	public void print()
	{
		System.out.println(this.employeeId + "\t" +
				this.name + "\t" +
				this.calculatePay());
	}

	@Override
	public int compareTo(Object o) {
	    if(this.calculatePay() == ((Employee)o).calculatePay())
	        return 0;
	    else if (this.calculatePay() < ((Employee)o).calculatePay())
	        return 1;
	    else 
	        return -1;
	}
}