package com.softserve.task5;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        int k = 1;
        for (Animal animal: animals) {
            System.out.print(k + " animal : " +
                    animal.feed() + " " +
                    animal.voice() + "\n");
            k++;
        }
    }
}
