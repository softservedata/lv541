package com.softserve.HomeWork6_2;


public class MainVoid {


	public static void main(String[] args) {
		Employee[] listEm= {new ContractEmployee("Ivan ", 40, 177, "5465465446"),
				new SalariedEmployee("Dmitriy ", 12369, "546546"),
				new ContractEmployee("Olena ", 40, 177, "735823"),
				new SalariedEmployee("Ivan ", 40, "2627378"),
				new ContractEmployee("Ivan ", 40, 177, "5465465446"),
				new ContractEmployee("Zhann ", 38, 16.45, "3388499926")};
		double averagMonthlyWage = 0;
		int count = 0;
		for (Employee Em : listEm){
			System.out.println(Em);
			if (Em instanceof SalariedEmployee) {
				averagMonthlyWage = averagMonthlyWage + ((SalariedEmployee)Em).calculatePay();
			}else {
				averagMonthlyWage = averagMonthlyWage + ((ContractEmployee)Em).calculatePay();
			}
			count = count + 1;
		}
		if (count != 0) {
			System.out.println("average monthly wage "+averagMonthlyWage/count);
		}

	}

}
