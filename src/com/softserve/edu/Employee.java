package com.softserve.edu;


public class Employee {
		private String name;
		private int age;
		private int salary;
		private int hours;
		public static int count;
		
		static {
			System.out.println("Static Block");
			count = 0;
		}
		public Employee(String name, int age, int salary, int hours) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.hours = hours;
			count++;
		}


		public Employee() {
			name = "";
			age =0;
			salary =0;
			hours =0;
			count++;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		public int getHours() {
			return hours;
		}


		public void setHours(int hours) {
			this.hours = hours;
		}


		public static int getCount() {
			return count;
		}


		public static void setCount(int count) {
			Employee.count = count;
		}
		}
