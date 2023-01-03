package com.example.demomapstruct.exception;

public class TokenNotFoundException extends RuntimeException{
    public TokenNotFoundException(String message){
        super(message);
    }
}
