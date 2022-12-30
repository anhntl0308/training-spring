package com.example.demomapstruct.exception;

//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no such student")
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("Student not found exception with student: " + id);
    }
}
