package com.mongo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="User API"))
public class MongoappSequenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoappSequenceApplication.class, args);
	}

}