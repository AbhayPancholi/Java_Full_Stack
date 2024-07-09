package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Demo1Application.class, args);
		MainPlace object = context.getBean(MainPlace.class);
//		System.out.println("Spring boot app is booting");
		object.getInfo();
	}

}
