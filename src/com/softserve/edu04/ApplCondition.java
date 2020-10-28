package com.softserve.edu04;

public class ApplCondition {
    public static void main(String[] args) {
        /*-
        int x = 1;
        int y = 0;
        //double result = x / y;
        double result = 1.0 * x / y;
        System.out.println("result = " + result);
        */
        /*-
        int x = 11;
        int y = 7;
        //
        int a = x + y;  // a = 18
        System.out.println("a = " + a);
        int s = x - y;  // s = 4
        System.out.println("s = " + s);
        int m = x * y;  // m = 77
        System.out.println("m = " + m);
        int d = x / y;  // d = 1;  11 = 1 * 7 + 4
        System.out.println("d = " + d);
        int r = x % y;  // r = 4
        System.out.println("r = " + r);
        */
        /*-
        int x = 5;
        int a, b;
        a = x++;    // a = 5 x = 6
        System.out.println("a = " + a +"   x = " + x);
        x--;        // x = 5
        b = ++x;    // b = 6 x = 6
        System.out.println("b = " + b +"   x = " + x);
        ++x;        // x = 7
        //
        boolean bool = true;
        System.out.println(bool);    // true
        System.out.println(!bool);   // false
        */
        /*-
        int x = 5;
        int y = -5;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x >= y); // true
        boolean bool = x < y;
        System.out.println("bool = " + bool); // false
        */
        /*-
        int t = 5, s = 4, v = 7;
        System.out.println( (t > s && t > v) || (s < v) ); // true
        System.out.println( (t < v || s > v) && (t < s) ); // false
        */
        byte b = 0x0A; // 0000 1010
        b = (byte) (b | 0xA0); // 0000 1010 | 1010 0000
        System.out.println("b =" + b);
        int k = b;
        k = k & 0x000000FF;
        System.out.println("k =" + k);
    }
}
