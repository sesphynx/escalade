package org.kuntum.nine.magma.addresseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.core.model")
public class AddresseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddresseServiceApplication.class, args);
	}

}
