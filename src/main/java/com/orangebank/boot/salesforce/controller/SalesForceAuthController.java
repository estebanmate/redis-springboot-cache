package com.orangebank.boot.salesforce.controller;

import com.orangebank.boot.salesforce.service.SalesForceService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesForceAuthController {

	private final SalesForceService salesForceService;

	public SalesForceAuthController( SalesForceService salesForceService) {
		this.salesForceService = salesForceService;
	}    

	@GetMapping("/test")
	public ResponseEntity<String> getToken(){
	    ;
	    String test=salesForceService.getSalesForceTest();
	    if(null!=test && !test.isEmpty()) {
	        return ResponseEntity.ok().body(test);
	    }else {
	        return null;
	    }		
	}
}
