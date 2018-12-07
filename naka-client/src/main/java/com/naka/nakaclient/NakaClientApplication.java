package com.naka.nakaclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.naka.nakaclient.controller",
"com.naka.nakaclient.biz","com.naka.nakaclient.dao"})
public class NakaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NakaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(NakaClientApplication.class, args);
//    }
}
