package com.softserve.edu06;

public class AppSort {
    public static void main(String[] args) {
        int[] arr = { 2, -5, 7, -4, 8, 4, -8, 3, 6 };
        //int[] arr = { -8, -5, -4, 2, 3, 4, 6, 8, 7 };
        //
        System.out.println("Origin Array:");
        for (int element : arr) {
            System.out.print(element + "  ");
        }
        /*-
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isBreak = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isBreak = false;
                }
            }
            if (isBreak) {
                break;
            }
        }
        */
        // /*-
        boolean isContinue = true;
        for (int i = 0; (i < arr.length - 1) && isContinue; i++) {
            isContinue = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isContinue = true;
                    System.out.print(".");
                }
            }
        }
        // */
        System.out.println("\nSorted Array:");
        for (int element : arr) {
            System.out.print(element + "  ");
        }
    }
}
