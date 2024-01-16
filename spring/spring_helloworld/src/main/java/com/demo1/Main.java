package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    //Passanger   --> vehical
        //Bean wiring
        //XML, Annotation, Java config
//        Vehical vehical=new Bike();
//        Passanger passanger=new Passanger();
//
//        passanger.setName("amit");
//        passanger.setVehical(vehical);
//        passanger.travel();

        //container

        //xml or xml + annotation
//        ApplicationContext ctx=
//                new ClassPathXmlApplicationContext("beans.xml");
//        Passanger passanger=(Passanger) ctx.getBean("p");
//
//        passanger.travel();

        //No xml + annotation
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
               Passanger passanger=(Passanger) ctx.getBean("p");
               passanger.travel();

    }
}