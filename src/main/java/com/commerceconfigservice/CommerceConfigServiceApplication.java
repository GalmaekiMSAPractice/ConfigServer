package com.commerceconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CommerceConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceConfigServiceApplication.class, args);
    }

}
