package com.day3.session3.collection_api;

import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

class OrderAsPerProductName implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }
}
class OrderAsPerPrice implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}


//Comparable and Comparator
//they are used to teach java how to sort the custom data
public class Order implements Comparable<Order> {
    private int orderId;
    private String productName;
    private double price;

    public Order(int orderId, String productName, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("orderId=" + orderId)
                .add("productName='" + productName + "'")
                .add("price=" + price)
                .toString();
    }


    public int getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.getOrderId(), o.getOrderId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Double.compare(price, order.price) == 0 && Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productName, price);
    }
}
