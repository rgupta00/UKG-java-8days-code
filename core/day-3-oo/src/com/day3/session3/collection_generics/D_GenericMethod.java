package com.day3.session3.collection_generics;

import java.io.Serializable;
import java.util.Comparator;
import java.util.StringJoiner;

class Product implements Comparable<Product> , Serializable{
    private int id;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
public class D_GenericMethod {
    public static void main(String[] args) {
//        Integer a=5;
//        Integer b=1;
//        Integer c=12;
//        Integer max=getMax(a, b , c);
//        System.out.println(max);

        Product a=new Product(121,"laptop",56000.00);

        Product b=new Product(12,"laptop cover",560.00);

        Product c=new Product(21,"laptop coolpad",1600.00);

        Product max=getMax(a, b , c);
        System.out.println(max);
    }

    private static  <T extends Comparable<T> & Serializable> T getMax(T a, T b, T c) {
        T max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;
        return max;
    }
}
