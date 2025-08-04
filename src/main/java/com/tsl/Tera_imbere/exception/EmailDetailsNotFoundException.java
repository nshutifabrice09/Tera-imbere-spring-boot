package com.tsl.Tera_imbere.exception;

public class EmailDetailsNotFoundException extends RuntimeException{

    public EmailDetailsNotFoundException(Long id){
        super
                ("Couldn't find an EmailDetails with id "+id);
    }
}
