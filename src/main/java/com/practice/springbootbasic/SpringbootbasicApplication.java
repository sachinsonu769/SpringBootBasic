package com.practice.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbasicApplication {

	public static void main(String[] args) {
		System.out.println("init");
		SpringApplication.run(SpringbootbasicApplication.class, args);
	}

}
