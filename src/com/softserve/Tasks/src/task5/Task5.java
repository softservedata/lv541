package task5;

import java.util.Arrays;

public class Task5 {
	public static void tasks() {
		 Task_5_1();
		 Task_5_2();
	}
	
	private static void Task_5_1() {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle();
		birds[1] = new Swallow();
		birds[2] = new Penguin();
		birds[3] = new Chicken();
		
		for(int i = 0; i < birds.length; i++)
		{
			birds[i].fly();
		}
	}
	
	private static void Task_5_2() {
		Employee[] employees = new Employee[4];
		
		employees[0] = new SalariedEmployee("FSE1", "Ivan", 3000, 0, 0, "0001");
		employees[1] = new SalariedEmployee("NFSE2", "Petro", 0, 20, 160, "0002");
		employees[2] = new SalariedEmployee("FSE3", "Indyk", 17000, 0, 0, "0003");
		employees[3] = new SalariedEmployee("CE4", "Oscar", 0, 40, 50, "0004");
		
		Arrays.sort(employees);
		
		for(int i = 0; i < employees.length; i++)
		{
			employees[i].print();
		}
	}
 }