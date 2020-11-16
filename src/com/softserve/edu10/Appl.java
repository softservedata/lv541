package com.softserve.edu10;
public class Appl {

    public void my1() {
        System.out.println("my1 start");
        try {
            my2(1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("+++Continue");
        }
    }

    public void my2(int i) throws Exception {
        if (i < 0) {
            throw new Exception("Ha-Ha-HA");
        }
    }

    public static void main(String[] args) {
        Appl app = new Appl();
        app.my1();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main done");
    }
}