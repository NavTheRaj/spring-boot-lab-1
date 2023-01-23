package com.navraj.springbootclass.aspect;

import com.navraj.springbootclass.entity.log.Logger;
import com.navraj.springbootclass.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LogOperationAspect {

    @Autowired
    private LoggerService loggerService;

    @Pointcut("within(com.navraj.springbootclass.controller..*)")
    public void logOperationAnnotation() {
    }

    @After("logOperationAnnotation()")
    public void logOperations(JoinPoint joinPoint) {
        var log = new Logger(LocalDateTime.now(),joinPoint.getSignature().getName());
        loggerService.save(log);
        System.out.println("Method " + joinPoint.getSignature().getName());

    }
}
