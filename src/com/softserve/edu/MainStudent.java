package com.softserve.edu;

public class MainStudent {
    public static void main(String[] args) {
     Student student1 = new Student("Ira");
     student1.setRating(90);
     Student student2 = new Student("Igor");
     student2.setRating(78);
     Student student3 = new Student("Olena");
     student3.setRating(67);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("Average rating of students is " + Student.getAvgRating());
        System.out.println("Total rating of all students = " + Student.sum);
        if (student1.betterStudent(student2) && student1.betterStudent(student3)){
            System.out.println("The first student " + student1.getName() + " has better rating than the second and the third students");
        } else if (student2.betterStudent(student1) && student2.betterStudent(student3)){
            System.out.println("The second student " + student2.getName() + " has better rating than the first and third students");
        } else if (student3.betterStudent(student1) && student3.betterStudent(student2)){
            System.out.println("The third student " + student1.getName() + " has better rating than the first and the second students");
        }


    }

}
