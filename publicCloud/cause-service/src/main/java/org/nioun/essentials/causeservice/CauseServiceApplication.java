package org.nioun.essentials.causeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niounsocial")
public class CauseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CauseServiceApplication.class, args);
	}

}
