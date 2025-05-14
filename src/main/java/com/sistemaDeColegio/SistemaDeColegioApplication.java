package com.sistemaDeColegio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaDeColegioApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SistemaDeColegioApplication.class, args);
	}

}
