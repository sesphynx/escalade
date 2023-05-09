package org.nioun.essentials.filiereservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niouncore")
@EnableEurekaClient
public class FiliereServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiliereServiceApplication.class, args);
	}

}
