package com.naka.nakaribbon.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 *@Author: Jeason.Law
 *@Date:2018-11-19 15:17
 *@Version: 1.0
 *@Description:
 **/

@Configuration
@ConditionalOnClass(value = {RestTemplate.class, HttpClient.class})
public class RestTemplateConfiguration extends RestTemplateAutoConfiguration {
    public RestTemplateConfiguration(ObjectProvider<HttpMessageConverters> messageConverters, ObjectProvider<RestTemplateCustomizer> restTemplateCustomizers) {
        super(messageConverters, restTemplateCustomizers);
    }

    @Override
    public RestTemplateBuilder restTemplateBuilder() {
        return super.restTemplateBuilder();
    }

    @Value("${remote.maxTotalConnect:0}")
    private int maxTotalConnect;
    @Value("${remote.maxConnectPerRoute:200}")
    private int maxConnectPerRoute;
    @Value("${remote.connectTimeout:2000}")
    private int connectTimeout;
    @Value("${remote.readTimeout:30000}")
    private int readTimeout;

    private ClientHttpRequestFactory createFactory() {
        if (this.maxTotalConnect <= 0) {
            SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
            factory.setConnectTimeout(this.connectTimeout);
            factory.setReadTimeout(this.readTimeout);
            return factory;
        }
        HttpClient httpClient = HttpClientBuilder.create().setMaxConnTotal(this.maxTotalConnect)
                .setMaxConnPerRoute(this.maxConnectPerRoute).build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        factory.setConnectTimeout(this.connectTimeout);
        factory.setReadTimeout(this.readTimeout);
        return factory;
    }

    @Bean
    @ConditionalOnMissingBean(RestTemplate.class)
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate(this.createFactory());
        List<HttpMessageConverter<?>> converterList = restTemplate.getMessageConverters();

        //重新设置StringHttpMessageConverter字符集为UTF-8，解决中文乱码问题
        HttpMessageConverter<?> converterTarget = null;
        for (HttpMessageConverter<?> item : converterList) {
            if (StringHttpMessageConverter.class == item.getClass()) {
                converterTarget = item;
                break;
            }
        }
        if (null != converterTarget) {
            converterList.remove(converterTarget);
        }
        converterList.add(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }


}
