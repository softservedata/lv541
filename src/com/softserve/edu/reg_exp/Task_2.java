package com.softserve.edu.reg_exp;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //Task 2
       System.out.println(new String("  I   am    learning   Java     Core")
               .trim().replaceAll("\\s{2,}", " "));

        //Task 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter US currency");
        String dol = scanner.nextLine();
        String pattern = "^\\$(([1-9]\\d*)?\\d)(\\.d\\d\\)?$";
        String p = "\\$(\\d*)(\\.\\d{2})?\n";
        System.out.println(pattern.matches(dol));    //false
        System.out.println(p.matches(dol));     //false
        scanner.close();
    }
}
