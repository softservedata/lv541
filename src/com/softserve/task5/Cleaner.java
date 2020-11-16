package com.softserve.task5;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 0;
    }

    @Override
    public String print() {
        return "I`m a cleaner";
    }
}
