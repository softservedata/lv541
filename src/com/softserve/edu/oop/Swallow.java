package com.softserve.edu.oop;

public class Swallow extends FlyingBird{
    private String name;

    public Swallow(String name, boolean feathers, int layEggs) {
        super(feathers, layEggs);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
