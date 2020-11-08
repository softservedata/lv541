package com.softserve.edu.oop;

public class Eagle extends FlyingBird{
    private String name;

    public Eagle(String name, boolean feathers, int layEggs) {
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
        return "Eagle{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
