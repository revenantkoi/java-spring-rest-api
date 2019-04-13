package com.example.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.demo")
@EntityScan("com.example.demo.model")
@EnableJpaRepositories("com.example.demo.repository")
public class JavaSpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringRestApiApplication.class, args);
	}

}
