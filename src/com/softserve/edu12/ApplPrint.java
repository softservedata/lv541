package com.softserve.edu12;

public class ApplPrint {
    public static void main(String[] args) {
        String s1 = "Normal ";
        String s2 = " High ";
        String s3 = " text";
        for (int i = 0; i < 5; i++) {
            System.out.println(s1 + i + s3);
            System.err.println(s2 + i + s3);
        }
    }
}
