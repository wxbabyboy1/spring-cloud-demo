package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by ZhaGuolong on 2018/1/19.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerHaApplication.class, args);
    }
}
