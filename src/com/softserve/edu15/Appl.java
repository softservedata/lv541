package com.softserve.edu15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Debug. Examples.
 * @author Lv-541.JavaCore
 */
public class Appl {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        System.out.print("num=");
        try {
            num = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("I/O Error.");
        }
        Calc calc = new Calc(num);
        System.out.print("Sum Digits=" + calc.sumDigits());
        Calc calc2 = new Calc(num);
        System.out.print("\nCount Digits=" + calc2.countNonZeroDigits());
    }
}
