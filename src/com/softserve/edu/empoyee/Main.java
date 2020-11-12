package com.softserve.edu.empoyee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList();
        employees.add(new SalariedEmployee("1", "Igor", "5443", 20000));
        employees.add(new ContractEmployee("2", "Ira", "87765", 500,  54));
        employees.add(new SalariedEmployee("3", "Nastya", "4456654", 25000));
        employees.add(new ContractEmployee("4", "Oleg", "225355", 600, 21));
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("");
        Collections.sort(employees);
        for (Employee e: employees) {
            System.out.println("Employee ID: " + e.getEmployeeId()
                    + " Name: " + e.getName()
                    + " Salary: " + e.calculatePay());
        }










            // Collections.sort(employees.);
          //  System.out.println(Collections.sort(calc));
    //  }
   //  Collections.sort();
      //employees
//        Comparator<Calculate> compareBySalary = (Employee first, Employee second) ->
//             first.calculatePay().

    }
}
