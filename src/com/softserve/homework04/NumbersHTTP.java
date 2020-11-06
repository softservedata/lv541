package com.softserve.homework04;

import java.util.Scanner;

public class NumbersHTTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Error number = ");
        int number = scanner.nextInt();
        HTTPError result = null;
        switch (number) {
        case 400:
            result = HTTPError.ERROR_400;
            break;
        case 401:
            result = HTTPError.ERROR_401;
            break;
        case 402:
            result = HTTPError.ERROR_402;
            break;
        default:
            System.out.println("Wrong!");
            throw new IllegalArgumentException("Invalid parameter: " + number);
        }
        System.out.print("Error message = " + result.getError());
    }
}
