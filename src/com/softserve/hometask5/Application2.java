package com.softserve.hometask5;

import java.util.ArrayList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("1", 2500));
        employees.add(new SalariedEmployee("2", 12, 220));
        employees.add(new ContractEmployee("3", 3000));
        employees.add(new SalariedEmployee("4", 10, 240));
        for (Employee employee: employees) {
            System.out.println("EmployeeId: " + employee.getEmployeeId() + ", and his salary: " + employee.calculatePay());
        }
    }
}
