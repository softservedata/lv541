package com.softserve.homework08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter US currency");
        String dol = scanner.nextLine();
        //String pattern = "^\\$(([1-9]\\d*)?\\d)(\\.d\\d\\)?$";
        String p = "\\$\\d+\\.\\d{2}";
        //System.out.println(dol.matches(pattern)); // false
        System.out.println(dol.matches(p)); // false
        scanner.close();
    }
}
