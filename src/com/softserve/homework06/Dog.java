package com.softserve.homework06;

public class Dog extends Pet {
    
    public Dog() {
        super("Barsik");
    }
    
    public Dog(String name) {
        super(name);
    }
    
    public void voice() {
        System.out.println("woof");
    }

    public void feed() {
        // TODO
    }
    
    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
