package com.softserve.edu06;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        /*-
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        //
        for (int i = 0; i < monthDays.length; i++) {
            System.out.println("monthDays[" + i + "]=" + monthDays[i]);
        }
        */
        /*-
        //int[] monthDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        //
        for (int i = 0; i < monthDays.length; i++) {
            System.out.println("monthDays[" + i + "]=" + monthDays[i]);
        }
        //
        //System.out.println("monthDays = " + monthDays);
        System.out.println("monthDays = " + Arrays.toString(monthDays));
        //
        for (int current : monthDays) {
            System.out.print(current + "  ");
        }
        */
        //
        /*-
        int[][] irregular = { { 1 }, { 2, 3, 4 }, { 5 }, { 6, 7 } };
        System.out.println("\nirregular array:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
        */
        //
//        int number = 0;
//        while (number <= 5) {
//            System.out.println(number);
//            number++;
//        }
        //
//        int i = 0;
//        do {
//            System.out.println("i = " + i + "  ");
//            i++;
//        } while (i <= 5);
        //
        int[] numbers = { 5, 6, 8, 3, 5, 7, 9 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //
        for (int current : numbers) {
            System.out.print(current + " ");
        }
        //
        System.out.println("done");
        // */
    }
}
