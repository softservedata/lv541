package com.softserve.edu;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner scanner = new Scanner(System.in);

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void input(){
        System.out.println("Please, enter the first name");
        this.firstName = scanner.nextLine();
        System.out.println("Please, enter the last name");
        this.lastName = scanner.nextLine();
        System.out.println("Please, enter the birthday year");
        this.birthYear = scanner.nextInt();
    }

    public int getAge(){
        System.out.println("Enter the current year");
        int currentYear = scanner.nextInt();
        return currentYear - this.birthYear;
    }
    public void output(){
        System.out.println("Person`s name = " + this.firstName
                + "\nPerson`s last name = " + this.lastName
                + "\nBirthday year = " + this.birthYear);
    }
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        System.out.println("Person`s new first name = " + firstName);
        this.lastName = lastName;
        System.out.println("Person`s new last name = " + lastName);
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
