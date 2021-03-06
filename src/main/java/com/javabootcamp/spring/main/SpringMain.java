package com.javabootcamp.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.javabootcamp.spring.service.EmployeeService;

public class SpringMain {
    public static void main (String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());
        employeeService.getEmployee().setName("Donpaw");
        employeeService.getEmployee().throwException();
        ctx.close();
    }
}
