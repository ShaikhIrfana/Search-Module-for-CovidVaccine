package com.DataJPA.searchModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.*")
@EntityScan("com.DataJPA.searchModule.entity")
public class SearchModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchModuleApplication.class, args);
	}

}
