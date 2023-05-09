package org.kuntum.nine.magma.privilegeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.core.niounmodel")
public class PrivilegeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivilegeServiceApplication.class, args);
	}

}
