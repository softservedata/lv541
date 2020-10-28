package com.softserve.hometask2;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("Andrii", "Dyriv");
        Person person2 = new Person();
        Person person3 = new Person("Vladyslav", "Tkachuk");
        Person person4 = new Person("Vitalii", "Danylyk");
        Person person5 = new Person();
        person2.setFirstName("Iruna");
        person2.setLastName("Bodnar");
        person5.changeName("Yana", "Montashevych");
        person3.changeName("Vitalii", "Yaremko");
        person1.setBirthYear(2000);
        person2.setBirthYear(2001);
        person3.setBirthYear(2003);
        person4.setBirthYear(1999);
        person5.setBirthYear(2000);
        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();
    }
}
