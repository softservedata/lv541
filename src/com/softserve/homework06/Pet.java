package com.softserve.homework06;

public abstract class Pet implements Animal {
    private String name;

    public Pet(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[name=" + name + "]";
    }
    
}
