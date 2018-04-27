package com.javabootcamp.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeXMLConfigAspect {

    Logger logger = LoggerFactory.getLogger(EmployeeXMLConfigAspect.class);

    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("EmployeeXMLConfigAspect::Before invoking getName() method");
        Object value = null;

        try {
            value = proceedingJoinPoint.proceed();
            logger.debug("debug value :", value);

        } catch (Throwable e) {
            e.printStackTrace();

        }
        System.out.println("EmployeeXMLConfigAspect::After invoking getName() method. Return value="+value);
        return value;
    }
}
