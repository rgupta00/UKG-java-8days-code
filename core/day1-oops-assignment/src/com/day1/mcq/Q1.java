package com.day1.mcq;
class Foo{
    void foo(String a){
        System.out.println("foo without String");

    }
    void foo(Double a){
        System.out.println("foo with Object");
    }
}
public class Q1 {
    public static void main(String[] args) {
       Foo f=new Foo();
      // f.foo(null);
    }
}
