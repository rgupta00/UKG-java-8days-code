package com.ukg.day1.session1;
//p
class A extends Object{
   private int i;
   public A(int i){
       this.i=i;
   }
   public void print(){
       System.out.println(" i "+ i);
   }
}
class B extends A{
   private int j;
  public B(int i, int j){
       super(i);
       this.j=j;
   }
    public void print(){
       super.print();
        System.out.println(" j "+ j);
    }

}
public class InheritanceDemo1 {
    public static void main(String[] args) {
       A b=new B(3,6);
        b.print();//Run time poly...
    }
}
