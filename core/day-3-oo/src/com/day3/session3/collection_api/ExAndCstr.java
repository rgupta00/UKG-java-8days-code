package com.day3.session3.collection_api;


import java.io.FileNotFoundException;
import java.io.IOException;
//
//class AEx extends Exception {
//}
//
//class BEx extends AEx {
//}
//
//class A {
//    void foo() throws AEx {
//    }
//}
//
//class B extends A {
//    void foo()throws NullPointerException{
//    }
//}

//class A{
//
//    A()throws IOException , NullPointerException{
//    }
//}
//
//class B extends A{
//
//    B()throws Exception {
//            super();
//    }
//}

 interface xyz {
    void abc() throws IOException;
}


 interface pqr {
    void abc() throws FileNotFoundException;
}

 class Implementation implements xyz, pqr {
     public void abc() throws FileNotFoundException{

     }
 }


public class ExAndCstr {
    public static void main(String[] args) {

    }
}
