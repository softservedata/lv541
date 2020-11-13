package Homework_Task2;

public  class Employee  implements PayMethod, Comparable<Employee>{
    public  String employeeId;
    public String Name;
    
   
 // Constructor 	
    public Employee(String employeeId, String name) {
		employeeId = "";
		Name = "";
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", Name=" + Name + "]";
	}


	@Override
	public int compareTo(Employee employee) {
		
		return (int) (this.calculatePay() - employee.calculatePay());
	}


	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}
}