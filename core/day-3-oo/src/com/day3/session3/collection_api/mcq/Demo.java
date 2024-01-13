package com.day3.session3.collection_api.mcq;

class Cat {
    public static String foo = "value";
}

class CostlyCat extends Cat {
    public static String foo = "value2";
}

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Cat().foo);
    }
}