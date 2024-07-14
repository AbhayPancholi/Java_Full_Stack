package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
		System.out.println("spring boot app");
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="controller") String name) {
		System.out.println("get method mapping works");
		return String.format("Get method using rest  %s !", name);
	}
	
	@PostMapping("/hello1")
	public String hello1(@RequestParam(value="name", defaultValue="controller") String name) {
		System.out.println("post method mapping works");
		return String.format("Post method using rest  %s !", name);
	}

}
