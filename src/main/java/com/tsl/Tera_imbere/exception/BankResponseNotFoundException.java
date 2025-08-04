package com.tsl.Tera_imbere.exception;

public class BankResponseNotFoundException extends RuntimeException{

    public BankResponseNotFoundException(Long id){
        super
                ("Couldn't find a BankResponse with id "+id);
    }
}
