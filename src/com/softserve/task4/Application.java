package com.softserve.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        int[] arr = {12, 15, -2, 7, 25, 0, -17, 85, -41, -63};
        int max = arr[0];
        int sumOfPositivElements = 0;
        int counterOfNegativeNumbers = 0;
        int counterOfPositiveNumbers = 0;
        for (int a : arr) {
            if (a >= max) {
                max = a;
            }
            if (a >= 0) {
                if (a > 0) {
                    counterOfPositiveNumbers++;
                }
                sumOfPositivElements += a;
            } else {
                counterOfNegativeNumbers++;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("SumOfPositivElements = " + sumOfPositivElements);
        System.out.println("counterOfNegativeNumbers = " + counterOfNegativeNumbers);
        if (counterOfNegativeNumbers > counterOfPositiveNumbers) {
            System.out.println("NegativeNumbers more than PositiveNumbers");
        } else {
            System.out.println("PositiveNumbers more than NegativeNumbers");
        }
        System.out.println("----------------------------");
        Employee e5 = new Employee("Ivan", 1, 2500);
        Employee e1 = new Employee("Yana", 2, 1970);
        Employee e3 = new Employee("Andrii", 2, 2100);
        Employee e2 = new Employee("Vitalii", 1, 3500);
        Employee e4 = new Employee("Ira", 2, 2050);
        Employee[] arrE = {e1, e2, e3, e4, e5};
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int departmentNumber = 0;
        System.out.println("Enter departmen number");
        try {
            departmentNumber = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee employee : arrE) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }
        System.out.println("----");
        Employee e0 = null;
        for (int i = 0; i < arrE.length - 1; i++) {
            for (int j = i + 1; j < arrE.length; j++) {
                if (arrE[i].getSalary() < arrE[j].getSalary()) {
                    e0 = arrE[i];
                    arrE[i] = arrE[j];
                    arrE[j] = e0;
                }
            }
        }
        for (Employee employee: arrE) {
            System.out.println(employee);
        }
    }
}
