package com.javabootcamp.spring.model;


import com.javabootcamp.spring.aspect.Loggable;

public class Employee {
    private String name;
    public String getName(){return name;}

    @Loggable
    public void setName(String nm){this.name = nm;}
    public void throwException(){new RuntimeException("Dummy Exception");}
}

