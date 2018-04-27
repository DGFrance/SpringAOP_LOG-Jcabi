package com.javabootcamp.spring.service;

import com.javabootcamp.spring.model.Employee;

public class EmployeeService {
    private Employee employee;
    public Employee getEmployee() {return employee;}
    public void setEmployee(Employee e) {this.employee = e;}
}
