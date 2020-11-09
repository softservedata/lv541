package com.softserve.edu08a;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    
    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return -st1.getName().compareTo(st2.getName());
        }
    }
    
    public static class ById implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getId() - st2.getId();
        }
    }
    
    private int id;
    private String name;

    public Student() {
        name = "";
        id = 0;
    }
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println("equals() running ...");
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
                || (id != other.id)
                || ( (name == null) && (other.name != null) )
                || ( (name != null) && (other.name == null) ) ) {
            return false;
        }
        if ( (name == null) && (other.name == null) ) {
            return true;
        }
        return name.equals(other.name);
    }

    public int compareTo(Student otherStudent) {
        //return getId() - otherStudent.getId();
        return getName().compareTo(otherStudent.getName());
    }
    
    @Override
    public String toString() {
        return "\nStudent [id=" + id
                + ", name=" + name
                + "]";
    }

}
