package org.kuntum.nine.magma.server.niounserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NiounServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiounServerApplication.class, args);
    }

}

