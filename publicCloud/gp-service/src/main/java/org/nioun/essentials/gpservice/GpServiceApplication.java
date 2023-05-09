package org.nioun.essentials.gpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niounlivraison")
public class GpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpServiceApplication.class, args);
	}

}
