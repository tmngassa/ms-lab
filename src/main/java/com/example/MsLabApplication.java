package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class MsLabApplication extends SpringBootServletInitializer {

	/**
	 * Used when run as a Jar
	 *
	 * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(MsLabApplication.class, args);
	}

	/**
	 * Used when run as a War
	 *
	 * @param builder
	 * @return
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MsLabApplication.class);
	}
}
