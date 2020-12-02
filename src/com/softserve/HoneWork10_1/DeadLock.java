package com.softserve.HoneWork10_1;

public class DeadLock{
 
    public static Object monitor1 = new Object();
    public static Object monitor2 = new Object();


    public static void main(String[] args) {
        DeadThreadOne threadOne = new DeadThreadOne();
        DeadThreadTwo threadTwo = new DeadThreadTwo();
        Thread t1= new Thread(threadOne);
        Thread t2= new Thread(threadTwo);

        t1.start();
        t2.start();
    }


}