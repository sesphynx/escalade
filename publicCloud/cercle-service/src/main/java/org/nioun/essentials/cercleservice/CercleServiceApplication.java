package org.nioun.essentials.cercleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niounsocial")
public class CercleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CercleServiceApplication.class, args);
	}

}
