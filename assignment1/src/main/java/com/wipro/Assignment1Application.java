package com.wipro;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

	@Bean
	public CommandLineRunner getBeans(ApplicationContext context) {

		return args -> {
			String[] beans = context.getBeanDefinitionNames();
			System.out.println("Beans from Spring Boot : ");

			Arrays.sort(beans);

			for (String bean : beans) {
				System.out.println(bean);
			}

		};

	}

}
