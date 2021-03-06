package com.microsoft.azure.springcloudplayground.exception;

@SuppressWarnings("serial")
public class InvalidVersionException extends RuntimeException {

    public InvalidVersionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVersionException(String message) {
        super(message);
    }

}
