package com.gungor.alper.ngpostbackend.ngpostbackend.exception;

/**
 * Created by Ag on 22.12.2019
 */
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}