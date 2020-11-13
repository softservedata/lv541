package Homework_Task2;

import java.util.ArrayList;

public class MainClassEmployee extends Employee {

	public static void main(String[] args) {
		SalariedEmployee emp1 = new SalariedEmployee ("EMP001", "John Smith", 5, 45, 5000,452);		
		SalariedEmployee emp2 = new SalariedEmployee ("EMP002", "Chriss Brown", 5000, 40);
		ContractEmployee emp3 = new ContractEmployee("EMP003", "Anita Barrel", 8000, 56);
		ContractEmployee emp4 =  new ContractEmployee("EMP004", "Kim Furie", 8000, 60);
		
		ArrayList<String> employees = new ArrayList<String>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
        System.out.printf("Employees ");
	}
}
		


