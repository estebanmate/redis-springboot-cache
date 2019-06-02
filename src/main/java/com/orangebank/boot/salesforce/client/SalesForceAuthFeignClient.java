package com.orangebank.boot.salesforce.client;

import com.orangebank.boot.salesforce.client.config.SalesForceAuthFeingClientConfiguration;
import com.orangebank.boot.salesforce.model.SalesForceAuthToken;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "salesforce-token", url = "${salesforce.token.url}", configuration= SalesForceAuthFeingClientConfiguration.class, primary = false)
//@FeignClient(name = "salesforce-token", url = "https://test.salesforce.com/services/oauth2", configuration= SalesForceAuthFeingClientConfiguration.class)
public interface SalesForceAuthFeignClient {

  @PostMapping(path="/${salesforce.token.endpoint}?"
          + "grant_type=${salesforce.token.grant-type}"
          + "&client_id=${salesforce.token.client-id}"
          + "&client_secret=${salesforce.token.client-secret}"
          + "&username=${salesforce.token.username}"
          + "&password=${salesforce.token.password}")
  @Cacheable(cacheNames = "${redis.cache-name}" , key = "${redis.key-name}")
  SalesForceAuthToken getToken();


}


