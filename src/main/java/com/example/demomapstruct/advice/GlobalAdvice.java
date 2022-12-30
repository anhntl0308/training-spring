package com.example.demomapstruct.advice;

import com.example.demomapstruct.exception.ApiError;
import com.example.demomapstruct.payload.BaseResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalAdvice extends ResponseEntityExceptionHandler {
    @Override
    protected @NotNull ResponseEntity<Object> handleNoHandlerFoundException(
            NoHandlerFoundException ex, @NotNull HttpHeaders headers, @NotNull HttpStatus status, @NotNull WebRequest request) {
        return ResponseEntity.badRequest().body(BaseResponse.builder().data("Could not find the " + ex.getHttpMethod()+" method for URL "+ ex.getRequestURL())
                .message("Method Not Found")
                .build());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleConstraintViolationException(Exception ex, WebRequest request) {
        return ResponseEntity.badRequest().body(BaseResponse.builder().data(ex.getMessage()).message("Constraint Violation").build());
    }

//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    protected ResponseEntity<?> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex,
//                                                                      WebRequest request) {
//        return ResponseEntity.badRequest().body(BaseResponse.builder().data(ex.getMessage()).message("Bad Request").build());
//    }
}
