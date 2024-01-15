package com.demo.calapp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {

    private  Calculator calculator;

//    @BeforeAll
//    public static void beforeAll(){
//        System.out.println("BeforeAll");
//    }
//    @DisplayName("")
    @BeforeEach
    public void before(){
      calculator=new Calculator();
    }

//    @Disabled
//    @Order(value = 1)
//    @DisplayName("add test")
//    @Test
//    public void addTestAssertAll(){
//        assertA
//        ll(
//                ()-> assertEquals(4, calculator.add(2,1)),
//                ()-> assertEquals(4, calculator.add(2,1)),
//                ()-> assertEquals(4, calculator.add(2,1))
//        );
//    }


//    @Disabled
//    @Order(value = 1)
//   @DisplayName("add test")
//    @Test
//    public void addTest(){
//       assertEquals(4, calculator.add(1,3));
//    }

//    @Order(value = 1)
//    @DisplayName("add test parameterized")
//    @ParameterizedTest
//    @CsvFileSource(resources ="/data.csv",numLinesToSkip = 1)
//    public void addTest(int n1, int n2, int result){
//        assertEquals(result, calculator.add(n1, n2));
//    }

    @Order(value = 2)
    @DisplayName("multiply test")
    @Test
    public void multiplyTest(){
        assertEquals(21, calculator.multiply(7,3));
    }

    @Order(value = 3)
    @DisplayName("divide with exception")
    @Test
    public void divide_with_exception_test(){
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

//    @AfterAll
//    public static void afterAll(){
//        System.out.println("AfterAll");
//    }
}
