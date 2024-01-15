package com.day4.lambda;

import java.io.Serializable;
import java.util.StringJoiner;

class Product{
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
