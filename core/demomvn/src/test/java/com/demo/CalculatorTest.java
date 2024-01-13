package com.demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void before(){
        calculator=new Calculator();
    }

    @Test
    public void addTest2(){
       assertAll(
               ()-> assertEquals(4, calculator.add(2,3)),
               ()-> assertEquals(4, calculator.add(2,3))
               );
    }

    @Test
    public void addTest(){
        assertThrows
                (ArithmeticException.class, ()-> calculator.divide(4,0),"divide by zero");
    }

    @Test
    public void multiplyTest(){
        assertEquals(18, calculator.multiply(9,2));
    }

    @Test
    public void divideTest(){
        assertEquals(3, calculator.divide(9,3));
    }

    @AfterEach
    public void after(){
        calculator=null;
    }
}
