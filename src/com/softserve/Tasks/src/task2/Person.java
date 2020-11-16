package task2;

import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge() {
		return 2020 - birthYear;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
    	this.setFirstName(scanner.nextLine());
    	this.setLastName(scanner.nextLine());
    	this.setBirthYear(scanner.nextInt());
    	scanner.close();
	}
	
	public void output() {
		System.out.println(this.firstName + " " + this.lastName + ", Age " + this.getAge());
	}
	
	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
