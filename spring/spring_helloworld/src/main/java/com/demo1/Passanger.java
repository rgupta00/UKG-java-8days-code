package com.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//S   OCP   LID

@Component(value="p") //bean id="p" class="com.demo1.Passanger"
public class Passanger {

    @Value("raj")
    private String name;

    @Autowired
    private Vehical vehical;

    public void setName(String name) {
        this.name = name;
    }

    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }

    public void travel(){
        System.out.println("name of passanger is : "+ name);
        vehical.move();
    }
}
