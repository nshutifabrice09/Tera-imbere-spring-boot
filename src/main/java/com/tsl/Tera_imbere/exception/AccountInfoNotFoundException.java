package com.tsl.Tera_imbere.exception;

public class AccountInfoNotFoundException extends RuntimeException{
    public AccountInfoNotFoundException(Long id){
        super("Couldn't find an AccountInfo with id "+id);
    }
}
