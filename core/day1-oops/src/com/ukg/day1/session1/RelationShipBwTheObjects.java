package com.ukg.day1.session1;

//use a: lightest
//Trainer named rajeev is using Marker: black to teach




class Marker{
    public void write(String topic){
        System.out.println(topic);
    }
}
class Trainer {
    private String name;
    public Trainer(String name){
        this.name=name;
    }
    public void teach(Marker marker, String topic){
        marker.write(topic);
    }
}

public class RelationShipBwTheObjects {

    public static void main(String[] args) {
        Marker marker=new Marker();
        Trainer trainer=new Trainer("rajeev");
        trainer.teach(marker,"basic oops concept");
    }
}
