package com.xdd.naka.xddnakabosseurekaserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: XddNakaManageBossEurekaServerApplication
 * @Package com.xdd.naka.xddnakabosseurekaserver
 * @Description: boss服务注册中心启动类
 * @author Jeason.Law
 * @date 2018-11-29:12:29:00
 */
@SpringBootApplication
@EnableEurekaServer
public class XddNakaBossEurekaServerApplication extends SpringApplicationBuilder {

    public static void main(String[] args) {
        new SpringApplicationBuilder(XddNakaBossEurekaServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
