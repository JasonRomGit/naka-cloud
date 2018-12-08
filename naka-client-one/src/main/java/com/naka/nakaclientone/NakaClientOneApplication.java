package com.naka.nakaclientone;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.naka.nakaclientone.controller",
        "com.naka.nakaclientone.biz","com.naka.nakaclientone.dao"})
public class NakaClientOneApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(NakaClientOneApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
