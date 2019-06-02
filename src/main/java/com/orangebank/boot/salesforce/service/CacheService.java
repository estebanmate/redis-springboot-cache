package com.orangebank.boot.salesforce.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(cacheNames = "testCache", key = "'myPrefix_'.concat(#relevant)")
    public String cacheThis(String relevant, String unrelevantTrackingId){
        //log.info("Returning NOT from cache. Tracking: {}!", unrelevantTrackingId);
        return "this Is it";
    }

    @CacheEvict(cacheNames = "testCache", key = "'myPrefix_'.concat(#relevant)")
    public void forgetAboutThis(String relevant){
        //log.info("Forgetting everything about this '{}'!", relevant);
    }
}
