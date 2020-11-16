package com.softserve.task5;

public class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public String print() {
        return "I`m a student";
    }
}
