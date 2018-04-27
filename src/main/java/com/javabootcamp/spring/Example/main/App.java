package com.javabootcamp.spring.Example.main;

import com.javabootcamp.spring.Example.config.AppConfig;
import com.javabootcamp.spring.Example.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        theAccountDAO.Test();
        context.close();
    }
}
