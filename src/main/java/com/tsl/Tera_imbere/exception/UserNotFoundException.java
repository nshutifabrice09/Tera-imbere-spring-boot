package com.tsl.Tera_imbere.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Could not find the booking with id "+id);
    }
}
