package com.xdd.naka.xddnakabosseurekaclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: XddNakaManageBossEurekaClientApplication
 * @Package com.xdd.naka.xddnakabosseurekaclient
 * @Description: boss服务客户端启动类
 * @author Jeason.Law
 * @date 2018-11-29:12:29:00
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class XddNakaBossEurekaClientApplication {


    @RequestMapping("/index")
    public String home(String name) {
        return "Hello  "+name+": you port is :"+8921;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(XddNakaBossEurekaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
