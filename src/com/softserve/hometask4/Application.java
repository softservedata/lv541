package com.softserve.hometask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        String[][] arrMounth = {{"January", "31"},
                {"March", "28"},
                {"April", "31"},
                {"May", "30"},
                {"June", "31"},
                {"July", "30"},
                {"August", "30"},
                {"September", "31"},
                {"November", "30"},
                {"October", "31"},
                {"November", "30"},
                {"December", "31"}};
        System.out.println("Please input number of mounth, but if January is 0 number");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int number = 0;
        try {
            number = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arrMounth[number][0] + " " + arrMounth[number][1]);
        System.out.println("---------------------");
        int[] arr0 = new int[10];
        for (int i = 0; i < arr0.length; i++) {
            try {
                arr0[i] = Integer.valueOf(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        boolean stop = true;
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < 5 && stop; i++) {
            if (arr0[i] > 0) {
                sum += arr0[i];
            } else {
                stop = false;
            }
        }
        if (stop) {
            System.out.println("Sum of first 5 numbers = " + sum);
        } else {
            for (int i = 5; i < arr0.length; i++) {
                multiply *= arr0[i];
            }
            System.out.println("Multiply of last 5 numbers = " + multiply);
        }
        System.out.println("------------------");
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            try {
                arr1[i] = Integer.valueOf(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int counter = 0;
        int min = 0;
        min = arr1[0];
        int minPosition = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[1] > 0) {
                counter++;
            }
            if (counter == 2) {
                System.out.println("Position of second positiv number = " + i);
            }
            if (min > arr1[i]) {
                min = arr1[i];
                minPosition = i;
            }
        }
        System.out.println("Min = " + min + " and his position = " + minPosition);
        System.out.println("----------------------");
        boolean stop2 = false;
        int product = 1;
        int k = 0;
        while (!stop2) {
            try {
                k = Integer.valueOf(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (k % 2 == 0) {
                product *= k;
            }
            if (k < 0) {
                stop2 = true;
            }
        }
        System.out.println("-------------------");
        Car c1 = new Car("Tesla", 2019, 700);
        Car c2 = new Car("Audi", 2019, 560);
        Car c3 = new Car("VW", 2018, 350);
        Car c4 = new Car("BMW", 2018, 560);
        System.out.println("Input Year");
        Car[] arrCar = {c1, c2, c3, c4};
        int year = 0;
        try {
            year = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Car car : arrCar) {
            if (car.getYear() == year) {
                System.out.println(car);
            }
        }
        System.out.println("---");
        Car c0 = null;
        for (int i = 0; i < arrCar.length - 1; i++) {
            for (int j = i + 1; j < arrCar.length; j++) {
                if (arrCar[i].getYear() > arrCar[j].getYear()) {
                    c0 = arrCar[i];
                    arrCar[i] = arrCar[j];
                    arrCar[j] = c0;
                }
            }
        }
        for (Car car : arrCar) {
            System.out.println(car);
        }
    }
}
