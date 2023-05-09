package org.nioun.essentials.caposervice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.core.niounmodel")
public class CapoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapoServiceApplication.class, args);
	}

}
