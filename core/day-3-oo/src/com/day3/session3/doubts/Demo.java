package com.day3.session3.doubts;

import java.io.*;

//throw(it is inside the method) and throws(on method sign)
class MyEx extends Exception{}//cheked
class YourEx extends Exception{}//cheked
//class Foo{
//    void foof() {
////        BufferedReader br=new BufferedReader(new FileReader(new File("foo.txt")));
//        if(1==1)
//            throw new YourEx();
//    }
//}

class AEx1 extends Exception{
}

class AEx2 extends AEx1{
}

class AEx3 extends AEx1{
}
class Foo{
    Foo()throws  Exception{
    }
//    void foof()throws FileNotFoundException {
//        System.out.println("I");
  //  }
}
class Bar extends Foo{
    Bar() throws Exception{

    }
//    void foof()throws IOException {
//        System.out.println("II");
//    }
}
public class Demo {
    public static void main(String[] args) {
        Foo f=new Bar();

//        Foo f=new Bar();
//        try {
//            f.foof();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
