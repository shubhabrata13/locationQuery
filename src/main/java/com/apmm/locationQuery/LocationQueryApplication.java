package com.apmm.locationQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.apmm","com.apmm.repository"})
@EnableR2dbcRepositories(basePackages = {"com.apmm.repository"})
public class LocationQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationQueryApplication.class, args);
	}

}
