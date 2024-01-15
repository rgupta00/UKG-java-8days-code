package com.day4.threads;
//Thread vs Runnable : Head first core java
class MyJob implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : "+ Thread.currentThread().getPriority());
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName()+" : "+ Thread.currentThread().getPriority());
    }
}
public class A_HelloThread {
    public static void main(String[] args) {
        System.out.println("inside main: "+ Thread.currentThread().getName()+" : "+ Thread.currentThread().getPriority());
       MyJob job=new MyJob();

        Thread t1=new Thread(job);

        t1.start();
       // t1.start();

        System.out.println("inside main: "+Thread.currentThread().getName()+" : "+ Thread.currentThread().getPriority());

    }
}
