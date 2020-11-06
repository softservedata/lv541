package com.softserve.homework06;

import java.util.LinkedList;
import java.util.List;

public class ApplAnimal {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Niki"), new Dog("Tuzik"), new Dog(), new Cat("Tom"), 
        };
        for (Animal current : animals) {
            System.out.print(current + "\t");
            current.voice();
        }
        //java.util.Comparator.comparing(s -> s.getPrice());
        //List<Integer> lst = new ArrayList<>();
        List<Integer> lst = new LinkedList<>();
        // code ...
    }
}
