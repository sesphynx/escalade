package org.nioun.essentials.rentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "org.nioun.essentials.rentautomodel.rent")
@EnableEurekaClient
public class RentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentServiceApplication.class, args);
    }

}
