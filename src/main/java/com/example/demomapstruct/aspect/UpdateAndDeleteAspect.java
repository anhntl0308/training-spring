package com.example.demomapstruct.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.logging.Logger;

@Aspect
@Component
@Slf4j
public class UpdateAndDeleteAspect {

    @Pointcut("within(com.example.demomapstruct.controller.*)")
    public void invalidRequest(){

    }

    @AfterThrowing(value = "invalidRequest()", throwing = "ex")
    public void loggerForInvalidRequest(JoinPoint jp, MethodArgumentNotValidException ex){
        log.error("Error when execute {} in {} with exception {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName(), ex.getMessage());
    }
}
