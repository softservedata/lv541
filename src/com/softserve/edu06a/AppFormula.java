package com.softserve.edu06a;

class MyFormula implements Formula {
        // Default Constructor
        @Override
        public double calculate(int a) {
            return sqrt1(a * 100);
        }
}

public class AppFormula {
    public static void main(String[] args) {
        //MyFormula formula = new MyFormula();
        //
        // /*-
        Formula formula = new Formula() { // Anonymous class
            @Override
            public double calculate(int a) {
                return sqrt1(a * 100);
            }
        };
        // */
        System.out.println("calculate(16) = " + formula.calculate(16));
    }
}