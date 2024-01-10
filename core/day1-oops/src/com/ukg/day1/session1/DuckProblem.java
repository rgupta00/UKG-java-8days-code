package com.ukg.day1.session1;

import java.util.ArrayList;
import java.util.List;

//Pond duck (3b+2w)
class Duck{
    private String color;

    public Duck(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("duck color: "+ color);
    }
}

class Pond{
    private String pondName;


    private List<Duck> ducks=new ArrayList<>();
    void init(){
        ducks.add(new Duck("white"));
        ducks.add(new Duck("black"));
    }
    public Pond(String pondName){
        this.pondName=pondName;
        init();
    }

    public void printPond(){
        System.out.println("pondName: "+pondName);
        for (Duck duck: ducks){
            duck.printInfo();
        }
    }

}
public class DuckProblem {

    public static void main(String[] args) {

    }
}
