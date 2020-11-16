package com.softserve.edu.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{

    public static class ByCourse implements Comparator<Student> {

        @Override
        public int compare(Student student1, Student student2) {
            return student1.getCourse() - student2.getCourse();
        }
    }

    private String name;
    private int course;

    public Student() {
        name = "";
        course = 0;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public static void printStudents(List <Student> students, Integer course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student current = iterator.next();
            if (course == current.getCourse()){
                System.out.println("Name of student: " + current.getName()
                        + " Course: " + current.getCourse());
            }
        }
    }
    @Override
    public int compareTo(Student o) {
        return -getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null
                || getClass() != obj.getClass()){
            return false;
        }
        Student other = null;
        if (obj instanceof Student){
            other = (Student) obj;
        }
        if ((other == null)
            || (course != other.course)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name) == null)){
            return false;
        }
        if ((name == null) && other.name == null){
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + course;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
