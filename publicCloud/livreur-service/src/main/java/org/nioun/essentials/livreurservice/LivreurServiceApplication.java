package org.nioun.essentials.livreurservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niounlivraison")
public class LivreurServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivreurServiceApplication.class, args);
	}

}
