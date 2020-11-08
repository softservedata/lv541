package com.softserve.edu.oop;

public class FlyingBird extends Bird {

    @Override
    boolean fly() {
        return true;
    }
    public FlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
