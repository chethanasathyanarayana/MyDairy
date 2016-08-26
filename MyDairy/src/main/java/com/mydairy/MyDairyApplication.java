package com.mydairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages="com.mydairy.*")
public class MyDairyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDairyApplication.class, args);
	}
}
