package com.apmm.exception;

public class BadPayloadException extends RuntimeException{
    private String message;
    public BadPayloadException(String message) {
        super(message);
        this.message = message;
    }
    public BadPayloadException() {
    }
}
