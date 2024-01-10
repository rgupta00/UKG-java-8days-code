package com.ukg.day1.session2.empapp;

public class FreeLancerConsultant  {
    private int companyRegistration;
    private String consulantName;
    private int noOfDays;
    private int payPerDay;


    public FreeLancerConsultant(int companyRegistration, String consulantName, int noOfDays, int payPerDay) {
        this.companyRegistration = companyRegistration;
        this.consulantName = consulantName;
        this.noOfDays = noOfDays;
        this.payPerDay = payPerDay;
    }

    public void printInfo(){
        System.out.println("companyRegistration: "+companyRegistration);
        System.out.println("consulantName: "+ consulantName);
        System.out.println("noOfDays: "+noOfDays);
        System.out.println("payPerDay: "+payPerDay);
    }
}
