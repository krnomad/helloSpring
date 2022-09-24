package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		String data = hello.getData();
		SpringApplication.run(SimpleApplication.class, args);
	}

}
