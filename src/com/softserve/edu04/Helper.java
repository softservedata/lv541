package com.softserve.edu04;

public class Helper {
    private String message;

    public String getMessage() {
        // Code
        return message;
    }

    public void setMessage(String message) {
     // Code
        this.message = message;
    }

    public static void print(Helper helper) {
        System.out.println("message = " + helper.getMessage());
    }
}
