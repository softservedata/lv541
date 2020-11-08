package com.softserve.edu.arr;

import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
        int [] amountOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the number of month");
        int month = scanner.nextInt();
      //  boolean bool = true;
        for (int i = 1; i <= amountOfDays.length; i++) {
            month = amountOfDays[i];
            System.out.println("The amount of days in this month = " + amountOfDays[i]);
            break;
        }
        scanner.close();


        System.out.println("Task 2");
        int [] numbers = {2, 3, 5, 1, 1, 2, 8, -2, 3, 45};
        int sum = 0;
       int product = 1;
            if ((numbers[0] > 0)
                    && (numbers[1] > 0)
                    && (numbers[2] > 0)
                    && (numbers[3] > 0)
                    && (numbers[4]> 0)) {
                sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
                System.out.println("Sum = " + sum);

            } else {
               product = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
                System.out.println("Product = " + product);
            }






        }
    }

