package com.gitpractice.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static int add(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(add(2,3));
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
