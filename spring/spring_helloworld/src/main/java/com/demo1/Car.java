package com.demo1;

import org.springframework.stereotype.Component;

// <bean id="v1" class="com.demo1.Car" />
@Component(value="v1")
public class Car  implements Vehical{
    public void move(){
        System.out.println("moving in a car");
    }
}
