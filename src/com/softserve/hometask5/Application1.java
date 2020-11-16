package com.softserve.hometask5;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Penguin());
        birds.add(new Swallow());
        birds.add(new Chicken());
        for (Bird bird : birds) {
            System.out.println("I`m a " + String.valueOf(bird.getClass()) + " and " + bird.fly());
        }
    }
}
