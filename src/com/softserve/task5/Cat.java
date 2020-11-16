package com.softserve.task5;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow-Meow";
    }

    @Override
    public String feed() {
        return "I eat fish";
    }
}
