package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebService1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebService1Application.class, args);
		System.out.println("Rest API using spring boot");
	}

}
