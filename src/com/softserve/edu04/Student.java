package com.softserve.edu04;

public class Student { // inherided Object
    private String name;
    private int age;
    private String info;
    
    public static int count;  //  = 0
    
    static {
        System.out.println("Static Block");
        count = 0;
    }

    public Student() {
        System.out.println("Default Constructor");
        name = "_";
        age = 0;
        info = "temporary";
        count++;
    }

    public Student(String name, int age) {
        System.out.println("Constructor with Parameters");
        this.name = name;
        this.age = age;
        info = "temporary";
        count++;
    }
    
    //public static int getCount() {
    public int getCount() {
        return count;
    }

    public String getName() {
        // Code ... Check
        return name;
    }

    public void setName(String name) {
        // Code ... Check
        this.name = name;
    }

    public int getAge() {
        // Code ... Check
        return age;
    }

    public void setAge(int age) {
        // Code ... Check
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name = " + name 
                + ", age = " + age 
                + ", info = " + info 
                + ", count = " + count
                + "]";
    }

}
