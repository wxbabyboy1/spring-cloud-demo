package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhaGuolong on 2018/1/19.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigClientBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}

