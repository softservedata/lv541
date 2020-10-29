package com.softserve.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        float [] num = new float[3];
        num[0] = scanner.nextFloat();
        num[1] = scanner.nextFloat();
        num[2] = scanner.nextFloat();
        if (num[0] >= -5 && num[0] <= 5){
            if (num[1] >= -5 && num[1] <= 5){
                if (num[2] >= -5 && num[2] <= 5){
                    System.out.println("All of the numbers belong to the range [-5,5]");
                }
            }
        }
        System.out.println("Task 2");

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));





        }
        }




