package com.softserve.edu.thread;

class Util {
    static void sleep (long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Synch {
    synchronized void test1(Synch s2){
        System.out.println("test1-begin");
        Util.sleep(1000);
        s2.test2(s1);  //err
        System.out.println("test2-end");
    }
    synchronized void test2(Synch s1){
        System.out.println("test2-begin");
        Util.sleep(1000);

        System.out.println("test2-end");
    }
}
class Thread1 extends Thread{
    private Synch s1;
    private Synch s2;

    public Thread1(Synch s1, Synch s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override
    public void run(){
        s1.test1(s2);
    }
}
class Thread2 extends Thread{
    private Synch s1;
    private Synch s2;

    public Thread2(Synch s1, Synch s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public void run(){
       // s2.test2(s1);
    }
}

public class Deadlock {
    public static void main(String[] args) {
        Synch s1 = new Synch();
        Synch s2 = new Synch();
        Thread1 t1 = new Thread1(s1, s2);
        t1.start();
        Thread2 t2 = new Thread2(s1, s2);
        t2.start();

        Util.sleep(2000);

    }
}
