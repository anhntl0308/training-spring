package com.example.demomapstruct.aspect;

import com.example.demomapstruct.dto.AbstractDTO;
import com.example.demomapstruct.dto.AddressDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class TestServiceAspect {
//    @Before("execution(* com.example.demomapstruct.controller.AbstractController.*(..)))")
//    public void before(JoinPoint joinPoint) {
//        log.info(" before called " + joinPoint.toString());
//    }
//
//    @After("execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void after(JoinPoint joinPoint) {
//        log.info(" after called " + joinPoint.toString());
//    }
//
//    @AfterReturning("execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterReturning(JoinPoint joinPoint) {
//        log.info(" afterReturning called " + joinPoint.toString());
//    }
//
//    @AfterThrowing("execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterThrowing(JoinPoint joinPoint) {
//        log.info(" afterThrowing called " + joinPoint.toString());
//    }
//
//    @Around("execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        Long startTime = System.currentTimeMillis();
//        log.info("Start Time Taken by {} is {}", joinPoint, startTime);
//        joinPoint.proceed();
//
//        Long timeTaken = System.currentTimeMillis() - startTime;
//        log.info("Time Taken by {} is {}", joinPoint, timeTaken);
//    }
//
    @Around(value = "@annotation(com.example.demomapstruct.annotation.TrackTime)")
    public void aroundTrackTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
        log.info("Start Time Taken by {} is {}", joinPoint, startTime);
        joinPoint.proceed();

        Long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }
}
