package com.softserve.edu08;

public class Appl {
    public static void main(String[] args) {
        //Box box = new Box();
        //BoxWrapper box = new BoxWrapper();
        BoxGen<Integer> box = new BoxGen<>();
        //
        box.set(123);
        // Code ...
        //String text = "Hello World";
        String text = "124";
        //box.set(text); // Compile Error
        //
        //Integer i = (Integer) box.get(); // Code Smell if Box box = new Box();
        Integer i = box.get();
        //
        System.out.println("i = " + i);
        //
        BoxGen<String> box2 = new BoxGen<>();
        box2.set(text);
        String s = box2.get();
        System.out.println("s = " + s);
    }
}
