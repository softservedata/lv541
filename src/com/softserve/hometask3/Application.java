package com.softserve.hometask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        task1();
        System.out.println("---------------------------------------");
        task2();
        System.out.println("---------------------------------------");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            HTTPError httpError = HTTPError.getName(Integer.valueOf(br.readLine()));
            System.out.println(httpError);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task2() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        try {
            a1 = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            a2 = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            a3 = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int max = a1;
        int min = a3;
        if (a1 < a3) {
            max = a3;
            min = a1;
        }
        if (a2 > max) {
            max = a2;
        } else if (a2 < min) {
            min = a2;
        }
        System.out.println("From this three numbers : " + a1 + "; " + a2 + "; " + a3 + ". \n" +
                "min = " + min + "\n" +
                "max = " + max);
    }

    private static void task1() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        float a1 = 0;
        float a2 = 0;
        float a3 = 0;
        try {
            a1 = Float.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            a2 = Float.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            a3 = Float.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a1 >= -5 && a1 <= 5 && a2 >= -5 && a2 <= 5 && a3 >= -5 && a3 <= 5) {
            System.out.println("All three numbers are in range from -5 to 5");
        } else {
            System.out.println("Not all three numbers are in range from -5 to 5");
        }

    }

}
