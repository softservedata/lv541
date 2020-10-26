package com.softserve.edu;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, address;
        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Where are you live, "+name + "?");
         address = in.next();
        System.out.println(name + " " + address);

    }
}
