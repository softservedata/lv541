package com.myproject.homework;

public class Ship {
    private int count;
    private Size size;
    private Type type;

    public Ship(Size size, Type type) {
    	System.out.println("-----------------------Create new Ship ");
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= size.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }


}