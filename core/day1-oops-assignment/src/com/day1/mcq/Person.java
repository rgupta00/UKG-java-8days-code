package com.day1.mcq;
interface Foof{
    void foof();
}
class Foof1Imp implements Foof{
    @Override
    public void foof() {
        System.out.println("foof is overriden");
    }
}
public class Person {
    public String name;

    public static void main(String str[]) {
        Person p = new Person();
        String s="foo";

        System.out.print(s instanceof String);

        Foof f1=new Foof1Imp();
        System.out.println(f1 instanceof Foof);
    }
}