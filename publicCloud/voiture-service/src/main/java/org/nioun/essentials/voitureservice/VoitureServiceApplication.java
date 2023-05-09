package org.nioun.essentials.voitureservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niountransport")
public class VoitureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureServiceApplication.class, args);
	}

}
