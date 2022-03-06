package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = Irepo.class)
public class SpringSecuritywithdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritywithdatajpaApplication.class, args);
	}
	
	

	
	
}
