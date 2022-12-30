package com.example.demomapstruct.advice;

import com.example.demomapstruct.exception.ApiError;
import com.example.demomapstruct.payload.BaseResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@ControllerAdvice
public class ConstrainValidationException extends ResponseEntityExceptionHandler {

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                               HttpHeaders headers,
                                                               HttpStatus status,
                                                               WebRequest request) {
        return ResponseEntity.badRequest().body(BaseResponse.builder().data(getErrorMessageFromException(ex)).message("Bad Request").build());
    }

    private String getErrorMessageFromException(MethodArgumentNotValidException ex){
        return ex.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));
    }

}
