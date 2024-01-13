package com.day3.session3.collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_StringCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("foo");
        list.add("aooooooo");
        list.add("boooo");
        list.add("cooo");

        Collections.sort(list);

        System.out.println(list);
    }
}
