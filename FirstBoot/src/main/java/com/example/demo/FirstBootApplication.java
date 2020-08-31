package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstBootApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		
		a.show();
		//System.out.println("Welcome to Boot");
	}

}
