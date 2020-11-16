package com.softserve.edu10;

public class AppEx1 {
    private int k = 1;

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        //throw new MyRunException("Exception thrown in method3");
        double d = Math.log(-11/0);
        System.out.println(d);
    }

    public void my(int i) throws MyException {
        System.out.println("my, i = " + i + "  k = " + k);
        if (i < 0) {
            throw new MyException("ha-ha-ha");
        }
        System.out.println("my done");
    }

    public static void main(String[] args) {
        AppEx1 app = new AppEx1();
//        try {
//            // app.my(-1);
//            app.my(1);
//        } catch (MyException e) {
//            // TODO Auto-generated catch block
//            // e.printStackTrace();
//            System.out.println("info = " + e.getMessage());
//            throw new MyRunException(e.getMessage());
//        }
        // app.method1();
        try {
            app.method1();
        } catch (Exception e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }

    }
}
