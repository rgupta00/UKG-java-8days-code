package com.day3.session1.revision_ex;
//module1
class MathsEx extends RuntimeException{
    public MathsEx(String message, Throwable cause) {
        super(message, cause);
    }
}
class MathsApi{
    public static int divide(int a,int b)throws MathsEx{
       try{
           if(b==0)
               throw new ArithmeticException("division by zero");
           return a/b;
       }catch (Exception e){
           throw new MathsEx(e.getMessage(),e);
       }
    }
}
public class E_ExWrappingAndRethrowing {
    public static void main(String[] args) {
        //u must handle it
        MathsApi.divide(2,0);
    }
}
