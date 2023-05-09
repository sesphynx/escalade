package org.nioun.essentials.addresseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niouncore")
@EnableEurekaClient
public class AddresseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddresseServiceApplication.class, args);
	}

}
