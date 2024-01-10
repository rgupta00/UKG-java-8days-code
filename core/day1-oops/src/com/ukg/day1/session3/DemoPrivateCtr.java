package com.ukg.day1.session3;
class MyDemo{
    private static  MyDemo myDemo=new MyDemo();
    private MyDemo(){
        System.out.println("it is private ctr dare to call");
    }
    public static MyDemo getMyDemo(){
        return myDemo;
    }
}

public class DemoPrivateCtr {
    public static void main(String[] args) {
        MyDemo myDemo=MyDemo.getMyDemo();
        System.out.println(myDemo.hashCode());

        MyDemo myDemo2=MyDemo.getMyDemo();
        System.out.println(myDemo2.hashCode());

    }
}
