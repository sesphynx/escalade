package org.nioun.essentials.niounboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NiounboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiounboardServiceApplication.class, args);
	}

}
