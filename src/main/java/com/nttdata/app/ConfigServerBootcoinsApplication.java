package com.nttdata.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerBootcoinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBootcoinsApplication.class, args);
    }

}
