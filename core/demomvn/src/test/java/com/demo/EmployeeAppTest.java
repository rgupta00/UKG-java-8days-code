package com.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeAppTest {

    @EnabledOnOs(OS.LINUX)
    @EnabledOnJre(JRE.JAVA_15)
    @DisplayName("test for add employee")
    @Order(value = 1)
    @Test
    public void addEmployee(){
        System.out.println("testing add employee");
    }
    @Order(value = 2)
    @Test
    public void showEmployee(){
        System.out.println("testing showEmployee");
    }
    @Order(value = 3)
    @Test
    public void updateEmployee(){
        System.out.println("testing updateEmployee");
    }
    @Order(value = 3)
    @Test
    public void deleteEmployee(){
        System.out.println("testing deleteEmployee");
    }
}
