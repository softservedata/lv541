package com.softserve.edu05;

public class Student {
    private String name;
    private int age;

    public Student() {
        name = "";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // Code
        return name;
    }

    public void setName(String name) {
        // Code
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() running ...");
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = null;
        if (obj instanceof Student) {
            other = (Student) obj;
        }
        if ((other == null) 
                || (age != other.age)
                || ( (name == null) && (other.name != null) )
                || ( (name != null) && (other.name == null) ) ) {
            return false;
        }
        if ( (name == null) && (other.name == null) ) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
