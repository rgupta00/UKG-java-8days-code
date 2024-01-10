package com.day1.assign;
/*

https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
 */
class Circle{
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }


}
public class A_Circle {
    public static void main(String[] args) {

    }
}
