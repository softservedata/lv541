package com.softserve.hometask3part2;

public class Application {
    public static void main(String[] args) {
        Dog d1 = new Dog("Alfa", Breed.BEAGLES, 2);
        Dog d2 = new Dog("Djeck", Breed.YORKSHIRE_TERRIERS, 3);
        Dog d3 = new Dog("Dina", Breed.FRENCH_BULLDOGS, 5);
        boolean isUniqeu = false;
        if (!d1.getName().equals(d2.getName())) {
            if (!d1.getName().equals(d3.getName())) {
                if (!d2.getName().equals(d3.getName())) {
                    System.out.println("Each dog has unique names");
                    isUniqeu = true;
                }
            }
        }
        if (!isUniqeu) {
            System.out.println("Some dogs have the same names");
        }
        if (d1.getAge() > d2.getAge()){
            if (d1.getAge() > d3.getAge()) {
                System.out.println(d1.getName() + " " + d1.getBreed());
            } else {
                System.out.println(d3.getName() + " " + d3.getBreed());
            }
        } else if (d2.getAge() > d3.getAge()) {
            System.out.println(d2.getName() + " " + d2.getBreed());
        } else {
            System.out.println(d3.getName() + " " + d3.getBreed());
        }
    }
}
