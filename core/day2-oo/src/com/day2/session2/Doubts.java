package com.day2.session2;

//class A{
//     void foo(){
//        System.out.println("hello");
//    }
//}
//class B extends A{
//     void foo(){
//        System.out.println("byte");
//    }
//}

class A{
   int i=55;
   public void foo(){
       System.out.println("i: "+ this.i);
   }
}
class B extends A{
    int i=66;
    public void foo(){
        System.out.println("i: "+ this.i);
        System.out.println("i: "+ i);
        System.out.println("i: "+ super.i);

    }
}

public class Doubts {
    public static void main(String[] args) {
      B a=new B();
       a.foo();
    }
}
