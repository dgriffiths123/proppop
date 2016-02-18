package com.proppop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@EnableAutoConfiguration
@SpringBootApplication
public class ProppopApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProppopApplication.class, args);
	}	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProppopApplication.class);
    }
}
