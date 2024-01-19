package com.productapp;

import com.productapp.dto.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//for cheking if conn etc are working or not
@Configuration
public class DSChecke implements CommandLineRunner {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public void run(String... args) throws Exception {
       productRepo.save(new Product("laptop",90000.00));
    }
}
