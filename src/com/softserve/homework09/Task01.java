package com.softserve.homework09;

public class Task01 {
    public static void main(String[] args) {
        Task01 main = new Task01();
        double res = 0;
        try {
            res = main.div(23.1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception found, message = " + e.getMessage());
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Unknown Exception");
        }
        System.out.println(res);

    }

    public double div(double d1, double d2) throws ArithmeticException {
        if (d2 == 0) {
            throw new ArithmeticException("Arithmetic Exception YES");
        }
        return d1 / d2;
    }
}
