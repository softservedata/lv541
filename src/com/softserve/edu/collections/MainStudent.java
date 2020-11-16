package com.softserve.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Olena", 5));
        students.add(new Student("Ira", 5));
        students.add(new Student("Igor", 3));
        students.add(new Student("Olya", 5));
        students.add(new Student("Vira", 4));
        students.add(new Student("Ivan", 5));
        Student.printStudents(students, 5);

        System.out.println("");
        Collections.sort(students);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }

        System.out.println("");
        Collections.sort(students, new Student.ByCourse());
        System.out.println(students);

        }
        }



