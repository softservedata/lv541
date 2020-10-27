package com.softserve.edu;

public class Student {
    private String name;
    private int rating;
    static int number = 0;
    static int sum = 0;

    public Student() {
        name = "";
        rating = 0;
        number++;
    }

    public Student(String name) {
        this.name = name;
        number++;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }
    public static double getAvgRating(){
        return (double) sum / number;
    }
    public boolean betterStudent(Student student){
        return this.getRating() > student.getRating();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
