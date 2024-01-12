package com.day3.session1.revision_ex.q1;
//how to customer ex throw and throws

//step 1: create a checked ex
class NegativeRadiusException extends Exception {

    public NegativeRadiusException(String message) {
        super(message);
    }
}

class Circle{

    private int radius;

    public Circle(int radius)throws NegativeRadiusException{
        if(radius<=0){
                throw new NegativeRadiusException("Radius must be positive u have entered : "+ radius);
        }
        this.radius = radius;
    }
    public double getCir(){
        return radius*2*Math.PI;
    }
}
public class C_UserDefineEx {
    public static void main(String[] args) {
       try{
           Circle circle = new Circle(12);
           System.out.println(circle.getCir());
       }catch (NegativeRadiusException e){
           System.out.println(e.getMessage());
       }
    }
}
