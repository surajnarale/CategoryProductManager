package com.nimap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.nimap")
public class CategoryProductManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryProductManagerApplication.class, args);
		System.err.println("Your Application is started");
	}

}
