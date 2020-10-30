package com.softserve.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = 0;
        int b = 0;
        System.out.print("a = ");
        try {
            a = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("b = ");
        try {
            b = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("-------------------------");
        System.out.println("How are you?");
        String answer = "_";
        try {
            answer = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You are " + answer);
    }
}
