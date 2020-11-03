package com.softserve.hometask3;

public enum HTTPError {
    BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, INTERNAL_SERVER_ERROR,
    GATEWAY_TIMEOUT, HTTP_VERSION_NOT_SUPPORTED;

    static HTTPError getName(int number) {
        if (number == 400) {
            return BAD_REQUEST;
        } else if (number == 401) {
            return UNAUTHORIZED;
        } else if (number == 402) {
            return PAYMENT_REQUIRED;
        }else if (number == 403){
            return FORBIDDEN;
        }else if (number == 404){
            return NOT_FOUND;
        }else if (number == 500){
            return INTERNAL_SERVER_ERROR;
        }else if (number == 504){
            return GATEWAY_TIMEOUT;
        }else if (number == 505) {
            return HTTP_VERSION_NOT_SUPPORTED;
        }else {
            return null;
        }

    }
}
