package com.day3.session1.revision_ex;

public class C_DontReturnFromFinallyBlock {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    private static int foo() {
        try {
            System.out.println("foo");
            return 1;
        }finally {
            System.out.println("bar");
            return 2;
        }
    }
}
