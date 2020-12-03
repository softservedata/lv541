package com.softserve.edu.thread;

public class Task3 {
    public static void main(String[] args) {
       Runnable one = () -> {
           System.out.println("start");
       };
       Runnable two = () -> {
           for (int i = 0; i < 3; i++) {
               System.out.println("Thread number two");
           }
       };
       Thread thread1 = new Thread();

    }
}
