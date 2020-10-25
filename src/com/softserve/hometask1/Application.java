package com.softserve.hometask1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double radius = 0;
        System.out.print("Task 1" + "\n" +
                "Please input radius value : ");
        try {
            radius = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        System.out.println("-----------------------");
    }

    public static void task2() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Task 2");
        System.out.println("What is your name?");
        String name = "";
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Where are you live " + name + "?");
        String address = "";
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("User name is " + name + " and he live by that address : " + address);
        System.out.println("-----------------------");
    }

    public static void task3() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Task 3");
        System.out.println("Please, input how much cost call in first country");
        double c1 = 0;
        try {
            c1 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, input how much cost call in second country");
        double c2 = 0;
        try {
            c2 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, input how much cost call in third country");
        double c3 = 0;
        try {
            c3 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, input how much time was call in first country");
        double t1 = 0;
        try {
            t1 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, input how much time was call in second country");
        double t2 = 0;
        try {
            t2 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, input how much time was call in third country");
        double t3 = 0;
        try {
            t3 = Double.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Call in first country will cost " + c1 * t1);
        System.out.println("Call in second country will cost " + c2 * t2);
        System.out.println("Call in third country will cost " + c3 * t3);
        System.out.println("All calls will cost " + (c1 * t1 + c2 * t2 + c3 * t3));
    }
}
