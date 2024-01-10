package com.ukg.day1.session2.empapp;

abstract public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public void printInfo(){
        System.out.println("employeeId: "+employeeId);
        System.out.println("employeeName: "+ employeeName);
        System.out.println("employeeSalary: "+employeeSalary);
    }
     public abstract  double payable();
}
