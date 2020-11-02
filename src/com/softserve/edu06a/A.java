package com.softserve.edu06a;

public class A extends A0 {
    private int i = 12;

    public A() {
        System.out.println("constructor A()");
    }

    public A(int i) {
        this.i = i;
        System.out.println("constructor A(int i)");
    }

    public int getI() {
        System.out.println("\tgetI() from A");
        return i;
    }

}
