package com.training.microservices.loyalty.exception;

public class NoUserWithUUIDException extends Throwable {
    public NoUserWithUUIDException(String errorMessage) {
        super(errorMessage);
    }
}
