package com.day2.session3;

import java.util.Objects;

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;//ClassCastException
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "rajeev");
        Employee emp2 = new Employee(101, "rajeev");

        System.out.println(emp.equals(emp2));


    }
}