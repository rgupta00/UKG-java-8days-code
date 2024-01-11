package com.day2.session3;

import java.io.*;

public class C_FileHanding {
    public static void main(String[] args) {
        //Deocorator dp
       try{
           BufferedReader  br=new  BufferedReader(new FileReader(new File("demo2.txt")));
       }catch (FileNotFoundException e) {
           System.out.println(e);
        }
        System.out.println("hello");
    }
}
