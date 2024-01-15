package com.day3.session3.collection_generics;
class Emp{

}
class Foo<T extends Comparable<T>>{
    private  T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class C_HowToThinkAboutGenClass {
    public static void main(String[] args) {
        //Foo<Emp> f=new Foo<>();
    }
}
