package com.softserve.edu.oop;

public class Chicken extends NonFlyingBird{
    private String name;

    public Chicken(String name, boolean feathers, int layEggs) {
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
        return "Chicken{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
