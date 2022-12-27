package com.example.demomapstruct.aspect;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Aspect
@Component
@Slf4j
public class AnyControllerAspect {
//    @Before(value = "@annotation(com.example.demomapstruct.annotation.MakeChangesInDatabase)")
//    public void beforeReceiveRequest(JoinPoint jp){
//        log.info("receive {} change database request from {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
//    }
//
//    @After(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterReciveRequest(JoinPoint jp){
//        log.info("complete {} request from {}", jp.getSignature().getName(), jp.getTarget().getClass().getSimpleName());
//
//    }
//
//    @Around(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..))")
//    public void afterReciveRequest(ProceedingJoinPoint pjp){
//        LocalDateTime start  = LocalDateTime.now();
//        try {
//            pjp.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//
//        LocalDateTime end = LocalDateTime.now();
//
//        log.info("Running time {} ms", end.toEpochSecond(ZoneOffset.UTC) - start.toEpochSecond(ZoneOffset.UTC) );
//    }

//    @AfterReturning(value = "execution(* com.example.demomapstruct.controller.AbstractController.*(..)))", returning = "res")
//    public void afterReturningRequest(JoinPoint jp, ResponseEntity res){
//        log.info("Address{}", res.getBody());
//
//    }
}
