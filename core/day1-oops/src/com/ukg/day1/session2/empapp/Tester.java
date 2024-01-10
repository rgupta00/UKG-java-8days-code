package com.ukg.day1.session2.empapp;

public class Tester {
    public static void main(String[] args) {
        //improve the design as explained
        //loose coupling and high cohesion
        //favour composition over inhertance
        //interface break the hierarchy

        Employee employee=new
                PartTimeEmp(1,"rajat",67000,20,2300);
        employee.printInfo();
    }
}
