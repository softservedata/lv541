package com.softserve.edu;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainDog {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Larry",BREED.BULLDOG, 5));
        dogs.add(new Dog("Larry",BREED.POODLE, 6));
        dogs.add(new Dog("Sharik",BREED.POMERANIAN, 7));

        System.out.println("Has the first dog the same name as the second? "
                + dogs.get(0).getName().equals(dogs.get(1).getName()));
        System.out.println("Has the second dog the same name as the third? "
                + dogs.get(1).getName().equals(dogs.get(2).getName()));
        System.out.println("Has the first dog the same name as the third? "
                + dogs.get(0).getName().equals(dogs.get(2).getName()));
        System.out.println("");

        Dog theOldestDog = dogs.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get();
        System.out.println("Name of the oldest dog = " + theOldestDog.getName()
                + ". Breed = " + theOldestDog.getBreed());







}
}
