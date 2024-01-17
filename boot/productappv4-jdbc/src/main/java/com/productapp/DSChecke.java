package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//for cheking if conn etc are working or not
@Configuration
public class DSChecke implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        if(dataSource!=null){
            System.out.println("ds is configured---------------");
        }else
            System.out.println("not------------------------------");
    }
}
