package org.nioun.essentials.produitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niouncommerce")
@EnableEurekaClient
public class ProduitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitServiceApplication.class, args);
	}

}
