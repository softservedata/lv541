package com.softserve.homework08;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = scanner.nextLine();
        s = s.replaceAll("\\s+", " ").trim();
        System.out.println("input string =" + s);
        String[] words = s.split(" ");
        int max = 0;
        String res = null;
        for (int i = 0; i < words.length; i++) {
            if (max < words[i].length()) {
                max = words[i].length();
                res = words[i];
            }
        }
        System.out.println(max);
        System.out.println(res);
        //

        StringBuilder sb = new StringBuilder();
        sb.append(words[1]);
        System.out.println("The second word in reverse order: " + sb.reverse());

    }
}