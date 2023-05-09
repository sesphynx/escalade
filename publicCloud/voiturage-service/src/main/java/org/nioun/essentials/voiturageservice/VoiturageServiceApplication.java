package org.nioun.essentials.voiturageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niountransport")
public class VoiturageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoiturageServiceApplication.class, args);
	}

}
