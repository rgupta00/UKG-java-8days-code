package com.day3.session2.st_ex;

import java.util.StringJoiner;

class Emp{
    private String name;
    private int id;
    private String dept;
    public Emp(String name,int id,String dept){
        this.name=name;
        this.id=id;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Emp.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("id=" + id)
                .add("dept='" + dept + "'")
                .toString();
    }
}
public class DemoToString {
    public static void main(String[] args) {

    }
}
