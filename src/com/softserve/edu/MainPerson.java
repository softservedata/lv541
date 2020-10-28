package com.softserve.edu;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person1.output();
        System.out.println("");
        System.out.println("Person`s age = " + person1.getAge() + " years old");
        System.out.println("");
        person1.changeName("Dasha", "Kolosova");

        System.out.println("");
        person2.input();
        person2.output();
        System.out.println("");
        System.out.println("Person`s age = " + person2.getAge() + " years old");
        System.out.println("");
        person2.changeName("Ira", "Omelan");

        System.out.println("");
        person3.input();
        person3.output();
        System.out.println("");
        System.out.println("Person`s age = " + person3.getAge() + " years old");
        System.out.println("");
        person3.changeName("Igor", "Furman");




    }
}
