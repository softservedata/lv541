package com.softserve.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Dog {
    private String name;
    private BREED breed;
    private int age;

    public Dog() {
        name = "";
        age = 0;
    }

    public Dog(String name, BREED breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public BREED getBreed() {
        return breed;
    }

    public void setBreed(BREED breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Dog dog = null;
        if (o instanceof Dog){
            dog = (Dog) o;
        }
        if ((dog == null)
                || (age != dog.age)
                || ((name == null) && (dog.name != null))
                || ((name != null) && (dog.name == null))){
            return false;
        }
        if ((name == null) && (dog.name == null)){
            return true;
        }

        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
