package com.softserve.homework09;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 task_2 = new Task_2();
        int num = task_2.readNumber(20, 90);
        System.out.println("num = " + num);
    }

    public int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int res = scanner.nextInt();
        int result = Integer.MIN_VALUE;
        try {
            if (res > start && res < end) {
                System.out.println(res);
                result = res;
            }
        } catch (NumberFormatException n) {
            System.out.println("NumberFormatException");
        } catch (Exception exception) {
            System.out.println("Exception");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return result;
    }
}