package com.ukg.day1.session2.empapp;

public class PartTimeEmp extends Employee{
    private int noOfDays;
    private int payPerHr;

    public PartTimeEmp(int employeeId, String employeeName, double employeeSalary,int noOfDays, int payPerHr) {
        super(employeeId, employeeName, employeeSalary);
      this.noOfDays=noOfDays;
      this.payPerHr=payPerHr;
    }

    @Override
    public double payable() {
        return noOfDays*payPerHr*0.8;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("noOfDays: "+noOfDays);
        System.out.println("payPerHr: "+payPerHr);
    }
}
