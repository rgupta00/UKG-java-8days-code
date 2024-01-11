package com.day2.session2;

import java.util.Scanner;

/*
"A person named ram moving from LN to Noida using metro/Bike"
 */
interface Vehicle{
      void move(String s, String d);
}

class Metro implements Vehicle{
    public void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d+ "using metro");
    }
}
class Bike implements Vehicle{
    public void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d+" using bike");
    }
}
class Car implements Vehicle{
    public void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d+" using car");
    }
}
class Passanger{
    private String name;

    public Passanger(String name) {
        this.name = name;
    }
    public void travel(String s, String d, Vehicle vehicle){
        System.out.println("name of passanger is :"+ name);
        vehicle.move(s, d);
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eter 1 for metro 2. car 3. Bike");
        int choice= scanner.nextInt();

        Vehicle v=null;

        if(choice==1){
            v=new Metro();
        }else if(choice==2){
            v=new Car();
        }else if(choice==3){
            v=new Bike();
        }
        if(v!=null) {
            Passanger passanger = new Passanger("ram");
            passanger.travel("LN", "noida", v);
        }else {
            System.out.println(" choose correct values");
        }
    }
}
