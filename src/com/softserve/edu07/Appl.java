package com.softserve.edu07;

public class Appl {
    private static Circle circle = new Circle(1);
    
    public static void main(String[] args) {
        Figure[] figures = { 
                new Circle(4), 
                new Rectangle(7, 8),
                new Circle(2),
                new Rectangle(5, 3), };
        for (Figure current : figures) {
            System.out.println("Figure: " + current);
            System.out.println("Area = " + current.getArea());
        }
        System.out.println(circle);
    }
}
