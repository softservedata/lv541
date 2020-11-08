package com.softserve.edu.oop;

public class NonFlyingBird extends Bird {

    @Override
    boolean fly() {
        return false;
    }

    public NonFlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
