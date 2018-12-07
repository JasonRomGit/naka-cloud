package com.naka.nakaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: XddNakaManageBossWebApplication
 * @Package com.xdd.naka.xddnakabossweb
 * @Description: boss系统web端启动类
 * @author Jeason.Law
 * @date 2018-11-29:12:29:00
 */
@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.xdd.*")
public class NakaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NakaWebApplication.class, args);
    }
}
