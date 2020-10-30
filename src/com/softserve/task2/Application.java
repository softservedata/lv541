package com.softserve.task2;

public class Application {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Ivan", 12.5);
        Employee employee3 = new Employee("Vasul", 11, 240);
        employee1.setName("Vitalii");
        employee1.setRate(11.5);
        employee1.setHours(220);
        employee2.setHours(300);
        System.out.println("Salary of employee1 = " + employee1.getSalary());
        System.out.println("Salary of employee2 = " + employee2.getSalary());
        System.out.println("Salary of employee3 = " + employee3.getSalary());
    }
}
