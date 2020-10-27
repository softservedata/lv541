package com.softserve.edu;

import java.util.Scanner;

public class myConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your name?");
      String name = scan.next();
      System.out.println(name);
    
      System.out.println("What is your age?"); 
     int age = scan.nextInt();
    
     System.out.println("Where do you live?");
     String address = scan.next();
     
     System.out.print("Your name is " + name + "Your age is " + age + "You live in" + address);
     
    }
}