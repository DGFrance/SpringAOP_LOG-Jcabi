package com.javabootcamp.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class EmployeeAfterAspect {

    @After("args(name)")
    public void logStringArguments (String name) {System.out.println("Running After Advice.String argument passed="+name);}

    @AfterThrowing("within (com.javabootcamp.spring.model.Employee)")
    public void  logExceptions(JoinPoint joinPoint){
        System.out.println("Exception throw in Employee Method=" +joinPoint.toString());
    }

    @AfterReturning(pointcut = "execution(* getName())", returning = ("returnString"))
    public void getNameReturningAdvice(String returnString){
        System.out.println("getNameReturningAdvice executed. Returned String =" +returnString);
    }

}
