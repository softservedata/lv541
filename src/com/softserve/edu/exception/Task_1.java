package com.softserve.edu.exception;


public class Task_1 {
    public static void main(String[] args) {
          Task_1 main = new Task_1();
          double res = 0;
        try {
           res = main.div(23.1, 0);
        } catch (NumberFormatException numberFormatException){
            System.out.println("NumberFormatException");
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Exception");
        }
        System.out.println(res);

    }
    public double div(double d1, double d2) throws ArithmeticException{
        if (d2 == 0){
            throw new ArithmeticException("ArithmeticException");
        }
       return  d1/d2;
    }
}
