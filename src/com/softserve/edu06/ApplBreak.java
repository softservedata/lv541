package com.softserve.edu06;

import java.util.Scanner;

public class ApplBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*-
        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                System.out.println("negative element; break");
                break;
            }
        }
        System.out.println("last int n =" + n);
        */
        /*-
        int n = 0;
        boolean isContinue = true;
        for (int i = 0; (i < 5) && isContinue; i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                System.out.println("break for (...)");
                //break;
                isContinue = false;
            }
        }
        System.out.println("last int n =" + n);
        */
        //
        /*-
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                continue;
            }
            sum = sum + n; // sum += n;
        }
        System.out.println("sum = " + sum);
        */
        // /*-
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0) {
                sum += n; // sum = sum + n;
            }
        }
        System.out.println("sum = " + sum);
        // */
        sc.close();
    }
}
