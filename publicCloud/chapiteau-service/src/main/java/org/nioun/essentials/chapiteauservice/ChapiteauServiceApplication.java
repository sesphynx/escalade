package org.nioun.essentials.chapiteauservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.niounsocial")
public class ChapiteauServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChapiteauServiceApplication.class, args);
	}

}
