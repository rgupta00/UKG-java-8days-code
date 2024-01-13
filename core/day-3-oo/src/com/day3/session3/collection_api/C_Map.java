package com.day3.session3.collection_api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_Map {
    public static void main(String[] args) {
        //create a map
        Map<String, Integer>map=new HashMap<>();
        map.put("raj",89);
        map.put("ekta",79);
        map.put("ekta",99);
        map.put("keshav",90);
        map.put("vikas",100);

        System.out.println(map);

        //
        map.forEach((k, v)-> System.out.println(k+" : "+ v));


        //insert some data into the map

        //iterator it

        //keyset vs entryset performance
//        Set<String> keys= map.keySet();
//        for(String k: keys){
//            System.out.println(k+" : "+ map.get(k));
//        }

        //entryset
        Set<Map.Entry<String, Integer>> entrySet=  map.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }


    }
}
