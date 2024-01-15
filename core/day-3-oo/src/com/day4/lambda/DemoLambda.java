package com.day4.lambda;

import java.util.Comparator;

public class DemoLambda {

    public static void main(String[] args) {

//       Product p1=new Product(1,"laptop",70000);
//
//        Comparator<Product> productComparator=new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return Integer.compare(o1.getId(), o2.getId());
//            }
//        };


//        Comparator<Product> productComparator=(Product o1, Product o2)-> {
//                return Integer.compare(o1.getId(), o2.getId());
//
//        };

        Comparator<Product> productComparator=( o1,  o2)-> Integer.compare(o1.getId(), o2.getId());



    }
}
