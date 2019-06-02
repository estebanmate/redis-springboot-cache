package com.orangebank.boot.salesforce.service;

import org.springframework.stereotype.Service;

import com.orangebank.boot.salesforce.client.SalesForceAuthFeignClient;

@Service
public class SalesForceAuthService {

    private final SalesForceAuthFeignClient salesForceAuthFeignClient;    

    public SalesForceAuthService(SalesForceAuthFeignClient salesForceAuthFeignClient){
        this.salesForceAuthFeignClient = salesForceAuthFeignClient;   
    }

  /**
   * Get a SalesForce token.
   * @return SalesForce token.
   */
  public String getSalesForceAuthToken() {
      return salesForceAuthFeignClient.getToken().getAccess_token();
  }

}