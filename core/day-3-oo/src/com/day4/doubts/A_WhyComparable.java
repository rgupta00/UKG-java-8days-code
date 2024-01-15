package com.day4.doubts;

import java.util.ArrayList;
import java.util.List;

public class A_WhyComparable {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();

        products.add(new Product(109,"laptop",70000));
        products.add(new Product(188,"laptop cover",1200));
        products.add(new Product(12,"laptop stand",700));

        products.sort(products);

    }
}
