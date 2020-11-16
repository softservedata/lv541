package com.softserve.task5;

public class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 0;
    }

    @Override
    public String print() {
        return "I`m a teacher";
    }
}
