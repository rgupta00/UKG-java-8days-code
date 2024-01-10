package com.ukg.day1.session3;
class Foo{

    static {
        System.out.println("static init block");
    }
    {
        System.out.println("common code 1");
        System.out.println("common code 2");
    }
    {
        System.out.println("common code 3");
        System.out.println("common code 4");
    }
    public Foo(){
        System.out.println("specific to default ctr");
    }
    public Foo(int a){
        System.out.println("specific to para ctr");
    }
}
public class NeedOfInitBlock {
    public static void main(String[] args) {
        Foo f1=new Foo(7);

        Foo f2=new Foo();
    }
}
