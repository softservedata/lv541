package com.softserve.HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

//Чи може бути приватний клас. які приклади
//як робити відладку. чи можна вираховувати поля при компіляції
public class Person {
	private String firstName, lastName;
	//як обмежити рік 
	private int birthYear;
	
	public Person() {
		firstName = "";
		lastName = "";
		birthYear = 0;	
	}
	
	public Person(String firstName,String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	private int getYear() {
		java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
		calendar.setTime(new java.util.Date());
		return  calendar.get(java.util.Calendar.YEAR);
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		//як тут робиться перевірки. Коли порахувалось щось не добре. Щось типу рік не вказано дату вказати не можливо 
		return getYear() - birthYear;
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter firs name = ");
		//як тут
		//firstName = br.readLine();
		setFirstName(br.readLine());
		
		System.out.print("Enter last name = ");
		setLastName(br.readLine());
		
		System.out.print("Enter birth year = ");
		int birthYearTest = Integer.parseInt(br.readLine());
		
		int yearNow = getYear();
		//System.out.println("yearNow "+yearNow);
		//if (birthYearTest <= yearNow || (getBirthYear() - birthYearTest) < 150  ) {
		if (birthYearTest <= yearNow && (yearNow - birthYearTest) < 150  ) {
			setBirthYear(birthYearTest);
		}else {
			System.out.println("Error birth year!");
		}
	}
	
	public void output() {
		//чи так можна. чи треба this чи немає сенсу
		System.out.println("person: "+this.toString());
	}
	
	public void changeName(String fn, String ln) {
		//якщо не заповнене поле то null?
		if (fn != null && fn != "") {
			firstName = fn;
		}
		if (ln != null && ln != "") {
			lastName = ln;
		}
		
	}

	@Override
	public String toString() {
		return "Person first name=" + firstName + ", last name=" + lastName + ", birth year=" + birthYear + "";
	}
	
	public static void main(String[] args) throws ParseException, IOException {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		Person person6 = new Person();
		//чи можна це зробити циклом, щоб не вводити рядки?
		person1.input();
		person2.input();
		person3.input();
		person4.input();
		person5.input();
		person6.input();
		

		
		person5.changeName("name1","");
		person2.changeName("first name","last name");
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		person6.output();	
		
		System.out.print("person 2 has "+person2.getAge());
	}
	

}
