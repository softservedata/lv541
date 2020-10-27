package com.softserve.edu;

public class Employee {
    private String name;
    private int rate;
    private int hours;
   public static int totalSum;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getSalary(){
        int salary = this.rate * this.hours;
        totalSum += salary;
        return salary;
    }
    public int changeRate(int rate){
        int newRate = rate * this.hours;
        return newRate;
    }
    public double getBonuses(){
        double bonuses = (this.rate * this.hours) * 0.1;
        return bonuses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
