package com.day3.session3.collection_api;

import java.util.*;

public class B_Set {
    public static void main(String[] args) {

        //hashing
//        Set<Order> list=new TreeSet<>(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                return Double.compare(o2.getPrice(), o1.getPrice());
//            }
//        });
        Set<Order> list=new TreeSet<>(new OrderAsPerPrice());

        list.add(new Order(11,"laptop",120000));
        list.add(new Order(1201,"laptop 1",12000));
        list.add(new Order(1,"laptop 4",720000));
        list.add(new Order(1991,"laptop 4",120070));


        for(Order o: list){
            System.out.println(o);
        }

    }
}
