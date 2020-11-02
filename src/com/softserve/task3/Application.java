package com.softserve.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("In task1 from three input number " + task1() + " is(are) odd");
        System.out.println("----------------------");
        int day = 0;
        try {
            day = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(DaysEng.getDay(day));
        System.out.println(DaysDeu.getDay(day));
        System.out.println(DaysUkr.getDay(day));
        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");
        Product p1 = new Product("Tesla", 90000, 12);
        Product p2 = new Product("BMW", 82000, 9);
        Product p3 = new Product("Toyota", 45000, 15);
        Product p4 = new Product("Ford", 33000, 11);
        if (p1.getPrice() > p2.getPrice()) {
            if (p1.getPrice() > p3.getPrice()) {
                if (p1.getPrice() > p4.getPrice()) {
                    System.out.println(p1.getName() + p1.getQuantity());
                } else {
                    System.out.println(p4.getName() + p4.getQuantity());
                }
            } else if (p3.getPrice() > p4.getPrice()) {
                System.out.println(p3.getName() + p3.getQuantity());
            } else {
                System.out.println(p4.getName() + p4.getQuantity());
            }
        } else if (p2.getPrice() > p3.getPrice()) {
            if (p2.getPrice() > p4.getPrice()) {
                System.out.println(p2.getName() + p2.getQuantity());
            } else {
                System.out.println(p4.getName() + p4.getQuantity());
            }
        } else if (p3.getPrice() > p4.getPrice()) {
            System.out.println(p3.getName() + p3.getQuantity());
        } else {
            System.out.println(p4.getName() + p4.getQuantity());
        }
    }

    public static int task1() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        try {
            a1 = Integer.valueOf(br.readLine());
            a2 = Integer.valueOf(br.readLine());
            a3 = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a1 % 2 != 0) {
            if (a2 % 2 != 0) {
                if (a3 % 2 != 0) {
                    return 3;
                } else {
                    return 2;
                }
            } else if (a3 % 2 != 0) {
                return 2;
            } else {
                return 1;
            }
        } else if (a2 % 2 != 0) {
            if (a3 % 2 != 0) {
                return 2;
            } else {
                return 1;
            }
        } else if (a3 % 2 != 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
