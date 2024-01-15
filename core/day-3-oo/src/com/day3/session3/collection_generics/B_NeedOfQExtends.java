package com.day3.session3.collection_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class B_NeedOfQExtends {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(20);
        list.add(02);

        print(list);

        List<Double> list2 = new ArrayList<>();
        list2.add(2.9);
        list2.add(20.9);
        list2.add(02.00);
        print(list2);

    }

    //u can print the data but can not change
//    private static void print(List<? extends Object> list) {
//
//        for (Object temp: list){
//            System.out.println(temp);
//        }
    // }
    private static void print(List<? extends Object> list) {
        for (Object temp : list) {
            System.out.println(temp);
        }
    }
}
