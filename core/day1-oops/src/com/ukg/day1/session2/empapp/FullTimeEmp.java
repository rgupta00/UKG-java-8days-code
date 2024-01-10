package com.ukg.day1.session2.empapp;

public class FullTimeEmp extends  Employee{
    private String ppf;

    public FullTimeEmp(int employeeId, String employeeName, double employeeSalary, String ppf) {
        super(employeeId, employeeName, employeeSalary);
        this.ppf=ppf;
    }

    @Override
    public double payable() {
        return super.getEmployeeSalary()*0.8;
    }
    public void printInfo() {
      super.printInfo();
        System.out.println("ppf: "+ppf);
    }
}
