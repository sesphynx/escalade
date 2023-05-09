package org.nioun.essentials.bailvoitureservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niountransport")
public class BailvoitureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BailvoitureServiceApplication.class, args);
	}

}
