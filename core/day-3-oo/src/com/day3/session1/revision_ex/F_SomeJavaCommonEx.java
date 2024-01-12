package com.day3.session1.revision_ex;
class A{ }
class B extends A{ }
class C extends A{ }

public class F_SomeJavaCommonEx {
    public static void main(String[] args) {
        A a1=new B();
        A a2=new C();
//        B b1=(B)a1;

        B b1=(B)a2;


    }
}
