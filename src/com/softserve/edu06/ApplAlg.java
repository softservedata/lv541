package com.softserve.edu06;

public class ApplAlg {
    public static void main(String[] args) {
        int[] arr = { 2, -5, 7, -4, 8, 4, -8 };
        /*-
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        */
        /*-
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                product = product * arr[i];
            }
        }
        System.out.println("Product = " + product);
        */
        /*-
        int amount = 0;
        for (int a : arr) {
            if ((a > 0) && (a <= 7)) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);
        */
        // /*
        int imax = 0;
        int max = arr[imax]; // Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                imax = i;
                max = arr[imax];
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");
        // */
    }
}