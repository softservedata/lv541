package com.softserve.edu06a;

public abstract class A0 implements IA {
    public int k = 789;

    public A0() {
        System.out.println("constructor A0()");
    }

    public abstract int getI();

    public void Hello() {
        System.out.println("Hello");
    }
}
