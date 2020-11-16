package com.softserve.task5;

public class Dog implements Animal {

    @Override
    public String voice() {
        return "Woof-woof";
    }

    @Override
    public String feed() {
        return "I eat bone";
    }
}
