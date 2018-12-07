package com.xdd.naka.boss.xddnakabossribbon;


import com.xdd.naka.boss.xddnakabossribbon.config.RestTemplateConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: XddNakaManageBossRibbonApplication
 * @Package com.xdd.naka.xddnakabossribbon
 * @Description: boss服务负载均衡启动类
 * @author Jeason.Law
 * @date 2018-11-29:12:29:00
 */
@ComponentScan(basePackages = {"com.xdd.naka.boss.xddnakabossribbon.config",
        "com.xdd.naka.boss.xddnakabossribbon.controller"})
@SpringBootApplication
@EnableEurekaClient
public class XddNakaBossRibbonApplication {
    @Autowired
    RestTemplateConfiguration restTemplateConfiguration;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
      return   restTemplateConfiguration.getRestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(XddNakaBossRibbonApplication.class, args);
    }
}
