package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
		return new CommandLineRunner() {
			public void run(String... args) throws Exception {

				System.out.println("Let's inspect the beans provided by Spring Boot:");

				String[] beanNames;
				beanNames = getAutowireCapableBeanFactory();
				Arrays.sort(beanNames);
				for (String beanName : beanNames) {
					System.out.println(beanName);
				}

			}
		};
	}

	private String[] getAutowireCapableBeanFactory() {
		return new String[0];
	}

}
