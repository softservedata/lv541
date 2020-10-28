package com.softserve.edu04;

public final class Util {
    
    public static void print(String welcomeMessage, Object... messages) {
        System.out.println("Message = " + welcomeMessage);
        for (Object msg : messages) {
            System.out.println(msg);
        }
    }
    
}
