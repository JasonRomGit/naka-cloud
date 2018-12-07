package com.naka.nakaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NakaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NakaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(NakaClientApplication.class, args);
//    }
}
