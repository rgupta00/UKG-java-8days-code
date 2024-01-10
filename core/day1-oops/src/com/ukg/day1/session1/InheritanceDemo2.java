package com.ukg.day1.session1;
class P{
  static public void foo(){
        System.out.println("foo method of class P");
    }
}
class Q extends P{
    static public  void foo(){
        System.out.println("foo method of class P overriden");
    }
    public  void bar(){
        System.out.println("foo method of class P overriden");
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Q  p=new Q();
        p.foo();
    }
}
