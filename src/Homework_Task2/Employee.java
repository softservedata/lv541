package Homework_Task2;

public class Employee {
    public  String employeeId;
    public String Name;
	
    public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		Name = name;
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
    
  
}
