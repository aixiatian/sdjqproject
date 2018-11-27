package com.day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class DayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayApplication.class, args);
    }
}
