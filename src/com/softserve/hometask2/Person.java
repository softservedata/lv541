package com.softserve.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String information = "-";

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }

    public void input() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            information = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output() {
        System.out.println(information);
    }

    public void changeName(String firstName, String lastName) {
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
}
