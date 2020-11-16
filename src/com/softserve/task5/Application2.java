package com.softserve.task5;

import java.util.ArrayList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Teacher());
        people.add(new Student());
        people.add(new Cleaner());
        people.add(new Student());
        people.add(new Cleaner());
        people.add(new Teacher());
        for (Person person: people) {
            System.out.print(person.print());
            if (person instanceof Staff) {
                System.out.print(", my salary is : " + ((Staff) person).salary());
            }
            System.out.println();
        }
    }
}
