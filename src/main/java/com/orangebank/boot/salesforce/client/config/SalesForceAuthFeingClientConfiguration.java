package com.orangebank.boot.salesforce.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
@EnableFeignClients("com.orangebank")
public class SalesForceAuthFeingClientConfiguration {

}
