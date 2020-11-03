package com.softserve.edu;

public enum HTTPError {
    ERROR400("Bad Request"), ERROR401("Unauthorized"), ERROR402("Payment Required");
    private String error;

    HTTPError(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }

    public static void getHTTPError(int err){
        HTTPError [] errors = HTTPError.values();
        System.out.println(errors[err] + " Name of this error = " + errors[err].error);
    }

}
