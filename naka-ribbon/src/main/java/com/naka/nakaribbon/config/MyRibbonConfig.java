package com.naka.nakaribbon.config;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author Jeason.Law
 * @date 2018-11-1916:17
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author: Jeason.Law
 *@Date:2018-11-19 16:17
 *@Version: 1.0
 *@Description:
 **/
@Configuration
@ExcudeAnnotation
public class MyRibbonConfig {

    @Bean
    public IRule ribbonRule() {

        return new RandomRule();
    }

}
