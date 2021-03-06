package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by ZhaGuolong on 2018/1/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignHystrixApplication.class, args);
    }
}