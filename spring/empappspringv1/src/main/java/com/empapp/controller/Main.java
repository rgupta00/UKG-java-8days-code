package com.empapp.controller;

import com.empapp.repository.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        List<Employee> employees=employeeService.getAll();
        System.out.println("-----------get all the employees--------");
        employees.forEach(e-> System.out.println(e));
//
//        Employee employee=employeeService.getById(2);
//        System.out.println(employee);

//        Employee employee=new Employee("umesh",8000.00);
//        employeeService.addEmployee(employee);
    }
}
