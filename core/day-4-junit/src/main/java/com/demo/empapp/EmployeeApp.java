package com.demo.empapp;

import java.util.InputMismatchException;

public class EmployeeApp {
    public Emp searchEmployee(String empName){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        return  new Emp(1,"raj",4000);
    }
}
