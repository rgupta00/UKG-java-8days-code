package com.day2.session2;

abstract class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
     public abstract void printInfo();
}
class PTEmp extends Employee{
    private int id;
    private String name;
    private double salary;

    public PTEmp(int id, String name, double salary) {
       super(id, name, salary);
    }
    public  void printInfo(){

    }
}



public class InherDoubt {
    public static void main(String[] args) {

    }
}
