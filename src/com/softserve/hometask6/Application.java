package com.softserve.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("First part");
        Set set1 = new TreeSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set set2 = new TreeSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        union(set1, set2);
        intersect(set1, set2);
        System.out.println("------------------------- \nSecond part");
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("L1", "F1");
        personMap.put("L2", "F2");
        personMap.put("L3", "F3");
        personMap.put("L4", "F4");
        personMap.put("L5", "F5");
        personMap.put("L6", "F5");
        personMap.put("L7", "F7");
        personMap.put("L8", "F8");
        personMap.put("L9", "F9");
        personMap.put("L10", "F10");
        System.out.println(personMap);
        boolean out = false;
        for (Iterator i = personMap.entrySet().iterator(); i.hasNext() && !out; ) {
            Map.Entry entry = (Map.Entry) i.next();
            for (Iterator i2 = personMap.entrySet().iterator(); i2.hasNext() && !out; ) {
                Map.Entry entry2 = (Map.Entry) i2.next();
                if (entry.getValue().equals(entry2.getValue()) && !(entry.getKey().equals(entry2.getKey()))) {
                    System.out.println("We don`t have at list 2 person with the same names");
                    out = true;
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = " ";
        System.out.println("Input name to delete");
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Iterator i = personMap.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry entry = (Map.Entry) i.next();
            if (entry.getValue().equals(name)) {
                i.remove();
            }
        }
        System.out.println(personMap);
        System.out.println("------------------------- \nThird part");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrii", 4));
        students.add(new Student("Yana", 4));
        students.add(new Student("Vitalii", 3));
        students.add(new Student("Ira", 3));
        students.add(new Student("Solomia", 1));
        students.add(new Student("Yura", 1));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Vladyslava", 2));
        printStudents(students, 2);
        Student test = null;
        for (Student student1 : students) {
            for (Student student2 : students) {
                
            }
        }
    }


    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        Student test;
        while (iterator.hasNext()) {
            test = iterator.next();
            if (test.getCourse() == course) {
                System.out.println(test.getName());
            }
        }
    }

    public static void union(Set set1, Set set2) {
        Set set3 = new TreeSet();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println(set3);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set set3 = new TreeSet();
        for (Integer b : set2) {
            for (Integer a : set1) {
                if (a == b) {
                    set3.add(a);
                }
            }
        }
        System.out.println(set3);
    }
}
