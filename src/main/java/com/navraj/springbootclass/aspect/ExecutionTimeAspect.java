package com.navraj.springbootclass.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {
    @Pointcut("@annotation(com.navraj.springbootclass.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Object calculateMethodCompletionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        var result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Method " +
                proceedingJoinPoint.getSignature().getName() +
                " took :" + (end - start) + " ms");
        return result;
    }
}
