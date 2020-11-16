package com.softserve.edu10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplEx {
    public static void main(String[] args) {
        int res = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("n = ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("k = ");
            int k = Integer.parseInt(br.readLine());
            res = n / k;
            System.out.println("***Block try done");
        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException | IOException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("+++finally block");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("IOException e");
                    // TODO Auto-generated catch block
                    // e.printStackTrace();
                }
            }
        }
        System.out.println("res = " + res);
    }
}
