package com.softserve.edu03;

public class ShowArgs {
    
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        System.out.println("done");
    }
}
