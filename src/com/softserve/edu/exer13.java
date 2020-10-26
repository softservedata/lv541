package com.softserve.edu;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c1, c2, c3, t1, t2, t3, ct1, ct2, ct3 , allct;
        System.out.println("What is country1 standard units per minute?");
        c1 = in.nextDouble();
        System.out.println("What is country2 standard units per minute?");
        c2 = in.nextDouble();
        System.out.println("What is country3 standard units per minute?");
        c3 = in.nextDouble();
        System.out.println("How long is talk1(minutes)?");
        t1 = in.nextDouble();
        System.out.println("How long is talk2(minutes)?");
        t2 = in.nextDouble();
        System.out.println("How long is talk3(minutes)?");
        t3 = in.nextDouble();
        ct1 = c1 * t1;
        ct2 = c2 * t2;
        ct3 = c3 * t3;
        allct = ct1 + ct2  + ct3;
        System.out.println("separately:" +"ct1 =" + ct1  +" ct2 =" + ct2  + " ct3 =" + ct3 );
        System.out.println("all together = " + allct);
    }
}
