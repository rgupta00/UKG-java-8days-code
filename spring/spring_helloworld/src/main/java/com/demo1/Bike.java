package com.demo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="v2" class="com.demo1.Bike" primary="true"/>
@Component(value = "v2")
@Primary
public class Bike implements Vehical{
    public void move(){
        System.out.println("moving in a bike");
    }
}
