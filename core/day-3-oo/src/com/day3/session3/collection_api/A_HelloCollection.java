package com.day3.session3.collection_api;

import java.util.*;

public class A_HelloCollection {
    public static void main(String[] args) {
        //user define data


        List<Order> list=new ArrayList<Order>(100);
        list.add(new Order(11,"laptop",120000));
        list.add(new Order(1201,"laptop 1",12000));
        list.add(new Order(1,"laptop 4",720000));
        list.add(new Order(1991,"laptop 4",120070));

        System.out.println("before sorting");
        printCollection(list);

        //Collections.sort(list);
        System.out.println("after sorting as per id");
        printCollection(list);

        Collections.sort(list, new OrderAsPerProductName());
        System.out.println("after sorting as per name");
        printCollection(list);


        Collections.sort(list, new OrderAsPerPrice());
        System.out.println("after sorting as per price");
        printCollection(list);






        //hello world collection




//
//        List<String> list=new ArrayList<String>(100);
//        list.add("foo");
//        list.add("bar");
//        list.add("jar");
//        list.add("car");
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//
//        int index= Collections.binarySearch(list, "raj");
//        System.out.println(index);

//
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//       ListIterator<String> listIt=list.listIterator(list.size());
//       while (listIt.hasPrevious()){
//           System.out.println(listIt.previous());
//       }


        //System.out.println(list);

//        for(String data: list){
//            System.out.println(data);
//        }


    }

    private static void printCollection(List<Order> list) {
        for(Order o: list){
            System.out.println(o);
        }
    }
}
