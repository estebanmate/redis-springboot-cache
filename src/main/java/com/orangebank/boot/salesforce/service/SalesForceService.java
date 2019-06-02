package com.orangebank.boot.salesforce.service;

import org.springframework.stereotype.Service;

import com.orangebank.boot.salesforce.client.SalesForceFeignClientTest;

@Service
public class SalesForceService {

    private final SalesForceFeignClientTest salesForceFeignClient;    

    public SalesForceService(SalesForceFeignClientTest salesForceFeignClient){
        this.salesForceFeignClient = salesForceFeignClient;   
    }

  /**
   * Get a SalesForce token.
   * @return SalesForce token.
   */
  public String getSalesForceTest() {
      return salesForceFeignClient.getTest();
  }

}