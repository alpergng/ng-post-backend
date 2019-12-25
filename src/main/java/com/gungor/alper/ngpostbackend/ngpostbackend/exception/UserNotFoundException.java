package com.gungor.alper.ngpostbackend.ngpostbackend.exception;

/**
 * Created by Ag on 24.12.2019
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
