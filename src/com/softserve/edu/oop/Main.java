package com.softserve.edu.oop;

public class Main {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
        birds[0] = new Eagle("Eagle", true, 5);
        birds[1] = new Swallow("Swallow", true, 3);
        birds[2] = new Penguin("Penguin", false, 6);
        birds[3] = new Chicken("Chicken", true, 5);
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i] + "\nDoes bird fly? " + birds[i].fly());
        }
        }
        }





