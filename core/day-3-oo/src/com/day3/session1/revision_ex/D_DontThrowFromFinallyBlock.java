package com.day3.session1.revision_ex;

public class D_DontThrowFromFinallyBlock {
    public static void main(String[] args) {
       foo();
    }

    private static int foo() {
        try {
            if(1==1){
                throw new NullPointerException();
            }
        }finally {
            throw new ArithmeticException();
        }
    }
}
