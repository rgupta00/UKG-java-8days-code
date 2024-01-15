package com.demo.empapp;

import com.demo.calapp.Calculator;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import java.time.Duration;

public class EmployeeAppTest {
    private EmployeeApp employeeApp;

    @BeforeEach
    public void before(){
        employeeApp=new EmployeeApp();
    }

    //@EnabledOnOs(OS.WINDOWS)
    //@EnabledOnJre(JRE.JAVA_8)
    @Test
    public void searchEmployeeTest(){
        assertTimeout(Duration.ofMillis(3000),()-> employeeApp.searchEmployee("raj"));
    }

    @AfterEach
    public void after(){
        employeeApp=null;
    }
}
