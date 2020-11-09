package com.softserve.edu08a;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        /*-
        Set<String> s = new HashSet<>();
        //List<String> s = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i])) {
                System.out.println("Duplicate detected: " + args[i]);
            }
        }
        System.out.println("Elements: " + s);
        */
        // /*-
        Set<Student> s = new HashSet<>();
        //Set<Student> s = new TreeSet<>();
        //Set<Student> s = new TreeSet<>(new Student.ById());
        //Set<Student> s = new TreeSet<>(new Student.ByName());
        boolean b;
        b = s.add(new Student(123, "Ivan"));
        System.out.println("s.add(new Student(123, \"Ivan\")) = " + b);
        b = s.add(new Student(124, "Petro"));
        System.out.println("s.add(new Student(124, \"Petro\")) = " + b);
        b = s.add(new Student(123, "Ivan"));
        System.out.println("s.add(new Student(123, \"Ivan\")) = " + b);
        b = s.add(null);
        System.out.println("s.add(null) = " + b);
        // System.out.println("Student: " + s);
        //
        for (Student current : s) {
            //if (current != null) {
            System.out.println("Student: " + current
                    + "  hashCode():" + ((current != null) ? current.hashCode() : null));
            //}
        }
        // */
    }
}