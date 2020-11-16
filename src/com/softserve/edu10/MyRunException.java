package com.softserve.edu10;

public class MyRunException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MyRunException(String msg) {
        super(msg);
    }

    // Empty constructor
    public MyRunException() {
    }

}