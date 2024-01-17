package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Productappv1Application  {


	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}
}
