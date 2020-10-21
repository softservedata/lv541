package com.softserve.edu03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*-
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter text = ");
        String text = br.readLine();
        System.out.print("enter age = ");
        String str1 = br.readLine();
        int age = Integer.parseInt(str1);
        System.out.print("enter num = ");
        double num = Double.parseDouble(br.readLine());
        //
        System.out.println("text = " + text);
        System.out.println("(age+1) = " + (age + 1));
        System.out.println("(num+1) = " + (num + 1));
        br.close();
        */
        /*-
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name = ");
        String name = sc.nextLine();
        System.out.print("enter age = ");
        int age = sc.nextInt();
        System.out.println("name = " + name);
        System.out.println("(age+1) = " + (age + 1));
        sc.close();
        */
        byte b = 101;       // 1 byte
        int n = b;          // 4 byte
        long ln = n + 1;    // 8 byte
        double d = ln + 5.21; // 8 byte
        System.out.println("ln = " + ln);
        System.out.println("d = " + d);
        //
        n = (int) ln - 1;
        System.out.println("n = " + n);
        ln = (long)d; // explicit
        System.out.println("new ln = " + ln);
    }
}
