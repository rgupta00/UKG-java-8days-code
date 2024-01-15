package com.day3.session3.collection_generics;

import java.util.*;

class Car{
    void move(){
        System.out.println("moving in car");
    }
}

public class A_HelloGenericcs {
    //Java 5:to create type safe collection?
    //type erased: compile time safty net
    //dont mix generics and non generic code: bug
    //<? extends XX>
    //<? super XX>
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("foo");

        foo(list);
        for(String s: list){
            System.out.println(s);
        }
    }

    //java 4
    private static void foo(List<String> list) {
       // list.add(4);
    }
}
