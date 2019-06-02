package com.orangebank.boot.salesforce.client;

import com.orangebank.boot.salesforce.client.config.SalesForceFeingClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "${salesforce.token.client}", url = "${salesforce.token.url}", configuration= SalesForceAuthFeigClientConfiguration.class, primary = false)
@FeignClient(name = "salesforce-api-call", url = "https://test.salesforce.com/services/data/v45.0", configuration= SalesForceFeingClientConfiguration.class)
public interface SalesForceFeignClientTest {

  @GetMapping(path="/test")
  String getTest();


}


