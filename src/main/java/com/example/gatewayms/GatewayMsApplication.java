package com.example.gatewayms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMsApplication.class, args);
    }

}
