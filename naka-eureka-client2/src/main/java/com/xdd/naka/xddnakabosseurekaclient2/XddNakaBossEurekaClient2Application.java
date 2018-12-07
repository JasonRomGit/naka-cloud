package com.xdd.naka.xddnakabosseurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: XddNakaBossEurekaClient2Application
 * @Package com.xdd.naka.xddnakabosseurekaclient2
 * @Description: boss服务客户端启动类
 * @author Jeason.Law
 * @date 2018-11-29:12:29:00
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class XddNakaBossEurekaClient2Application {

    @RequestMapping("/index")
    public String home(String name) {
        return "Hello  "+name+": you port is :"+8922;
    }

    public static void main(String[] args) {

        new SpringApplicationBuilder(XddNakaBossEurekaClient2Application.class).web(WebApplicationType.SERVLET).run(args);
    }
}
