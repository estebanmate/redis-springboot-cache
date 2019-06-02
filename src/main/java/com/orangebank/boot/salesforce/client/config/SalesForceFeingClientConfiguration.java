package com.orangebank.boot.salesforce.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.orangebank.boot.salesforce.interceptor.SalesForceInterceptor;

import feign.RequestInterceptor;

@Configuration
@EnableFeignClients("com.orangebank")
public class SalesForceFeingClientConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new SalesForceInterceptor();
    }

}
