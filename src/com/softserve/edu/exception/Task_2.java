package com.softserve.edu.exception;

import java.io.IOException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 task_2 = new Task_2();
        task_2.readNumber(20, 90);

    }
    public void readNumber(int start, int end){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int res = scanner.nextInt();
       try {
           if (res > start || res < end){
               System.out.println(res);
           }
       } catch (NumberFormatException n){
           System.out.println("NumberFormatException");
       } catch (Exception exception){
           System.out.println("Exception");
       }
       finally {
          if (scanner != null){
              try {
                   scanner.close();
               } catch (Exception e){                     // IOException
                   System.out.println("IOException ex");  // Exception 'java.io.IOException
               }                                          // is never thrown in the corresponding try block
           }
       }

    }
}
