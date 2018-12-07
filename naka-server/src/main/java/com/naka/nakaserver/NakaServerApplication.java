package com.naka.nakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NakaServerApplication extends SpringApplicationBuilder {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NakaServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}

