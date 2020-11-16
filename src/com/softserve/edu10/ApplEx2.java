package com.softserve.edu10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplEx2 {
    public static void main(String[] args) {
        int res = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
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
        }
        System.out.println("res = " + res);
    }
}
