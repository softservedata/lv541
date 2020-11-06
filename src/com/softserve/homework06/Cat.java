package com.softserve.homework06;

public class Cat extends Pet {
    
    public Cat() {
        super("Murchyk");
    }
    
    public Cat(String name) {
        super(name);
    }
    
    public void voice() {
        System.out.println("meow");
    }

    public void feed() {
     // TODO
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
    
}
