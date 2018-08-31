package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDbAppApplication{
	 	

	public static void main(String[] args) {
		SpringApplication.run(SpringDbAppApplication.class, args);
	}

}
