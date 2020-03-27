package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWithJspApplication {

	

@Bean
public Bank	getBank(){  
	return new Bank();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWithJspApplication.class, args);
	}

}
