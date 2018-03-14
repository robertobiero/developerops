package com.rob.devoloperops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DeveloperopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperopsApplication.class, args);
	}
}
