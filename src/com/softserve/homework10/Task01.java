package com.softserve.homework10;

import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
    private List<Thread> toJoin;
    
    public MyThread(Thread... threads) {
        toJoin = new ArrayList<>();
        for (Thread currentThread : threads) {
            toJoin.add(currentThread);
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\t\t\tThird thread, id = " + Thread.currentThread().getId());
        }
        for (Thread currentThread : toJoin) {
            try {
                currentThread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 
        System.out.println("\t\t\tThird thread DONE, id = " + Thread.currentThread().getId());
    }
};

public class Task01 {
    private static List<Thread> threadAll = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread, id = " + Thread.currentThread().getId());
        //
        Runnable run1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("\tFirst thread, id = " + Thread.currentThread().getId());
            }
            System.out.println("\tFirst thread DONE, id = " + Thread.currentThread().getId());
        };
        Thread thread1 = new Thread(run1);
        threadAll.add(thread1);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        //
        Runnable run2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("\t\tSecond thread, id = " + Thread.currentThread().getId());
            }
            System.out.println("\t\tSecond thread DONE, id = " + Thread.currentThread().getId());
        };
        Thread thread2 = new Thread(run2);
        threadAll.add(thread2);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        //
        // /*-
        Runnable run3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("\t\t\tThird thread, id = " + Thread.currentThread().getId());
            }
            for (Thread currentThread : Task01.threadAll) {
                try {
                    currentThread.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        } 
            System.out.println("\t\t\tThird thread DONE, id = " + Thread.currentThread().getId());
        };
        // */
        //Runnable run3 = new MyThread(thread1, thread2);
        Thread thread3 = new Thread(run3);
        //thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();
        //
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Main thread DONE, id = " + Thread.currentThread().getId());
    }
}
