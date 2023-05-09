package org.nioun.essentials.producteurservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niouncommerce")
@EnableEurekaClient
public class ProducteurServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducteurServiceApplication.class, args);
	}

}
