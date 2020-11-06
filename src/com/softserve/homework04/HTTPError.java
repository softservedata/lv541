package com.softserve.homework04;

public enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required");
    
    private String error;

    HTTPError(String error) {
        this.error = error;
    }
    
    public String getError() {
        return error;
    }

}
