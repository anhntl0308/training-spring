package com.example.demomapstruct.advice;

import com.example.demomapstruct.exception.ResourceNotFoundException;
import com.example.demomapstruct.payload.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ControllerAdvice
public class ResourceNotFoundAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> resourceNotFoundAdvice(){
        return ResponseEntity.internalServerError().body(BaseResponse.builder()
                .message("resource is not found")
                .code("404")
                .build());
    }
}
