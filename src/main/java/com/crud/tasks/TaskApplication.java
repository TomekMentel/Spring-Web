package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TaskApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder aplication){
	    return aplication.sources(TaskApplication.class);
    }

}
