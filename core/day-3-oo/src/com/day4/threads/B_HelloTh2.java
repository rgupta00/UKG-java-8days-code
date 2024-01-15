package com.day4.threads;

public class B_HelloTh2 {
    public static void main(String[] args) {
        //java
        //ann inner class : :( performance problem
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello job");
            }
        };
        //lambda funcational progreamming : js , pytyon

      Runnable r2=() -> System.out.println("hello job");




        Thread t=new Thread(r,"foo");
        t.start();
//
//        Thread t2=new Thread("foo2");
//        t2.start();

    }
}
