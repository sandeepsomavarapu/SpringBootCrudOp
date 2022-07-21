package com.onmobile.empmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@Configuration,@ComponentScan,@EnableAutoConfiguration
public class SpringBootJpaHIbernateEmployeeCrudRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHIbernateEmployeeCrudRestApplication.class, args);
		System.out.println("Welcome to Onmobile");
	}

}
