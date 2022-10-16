package com.Proyecto.Colegio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Proyecto.Colegio"})
public class ColegioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColegioApplication.class, args);
	}

}
