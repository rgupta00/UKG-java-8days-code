package com.demo.calapp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {

    private  Calculator calculator;

    @BeforeEach
    public void before(){
      calculator=new Calculator();
    }

    @Order(value = 2)
    @DisplayName("multiply test")
    @Tag("prod")
    @Test
    public void multiplyTest(){
        System.out.println("prod test multiplyTest");
        assertEquals(21, calculator.multiply(7,3));
    }

    @Order(value = 3)
    @DisplayName("divide with exception")
    @Test
    @Tag("dev")
    public void divide_with_exception_test(){
        System.out.println("dev test multiplyTest");
        assertThrows(ArithmeticException.class,
                ()->calculator.divide(20,0),
                "divide by zero");
    }

    @Order(value = 3)
    @DisplayName("divide test")
    @Test
    public void divide_test(){
        assertEquals(2, calculator.divide(6,3));
    }

    @AfterEach
    public void after(){
        calculator=null;
    }


}
