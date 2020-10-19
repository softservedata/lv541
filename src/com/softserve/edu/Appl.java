package com.softserve.edu;

public class Appl {
    private int i = 123;
    
    // JVM add default Constructor
    //public Appl() {
    //} 

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Appl app1 = new Appl();
        Appl app2 = new Appl();
        //
        app1.i = 234;
        app2.i = 4321;
        System.out.println("app1.i = " + app1.i);
        System.out.println("app2.i = " + app2.i);
    }
}
