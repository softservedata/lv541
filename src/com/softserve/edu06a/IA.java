package com.softserve.edu06a;

public interface IA {
    int r = 555;  // public static final

    int getI(); // public abstract

    default void Privet() { // public
        System.out.println("Privet");
    }

}