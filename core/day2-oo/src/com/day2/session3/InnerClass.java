package com.day2.session3;
//annoymous inner class
interface Cook{
    void cook();
}
public class InnerClass {
    public static void main(java.lang.String[] args) {

        Cook c = () ->{
                System.out.println("it is a ann impl");

        };

        c.cook();
        Cook c2 = new Cook() {
            @Override
            public void cook() {
                System.out.println("it is a ann impl 2");
            }
        };

        Cook c3 = new Cook() {
            @Override
            public void cook() {
                System.out.println("it is a ann impl 2");
            }
        };





    }
}
