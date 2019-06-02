package com.orangebank.boot.salesforce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.orangebank.boot.salesforce.service.CacheService;

@EnableCaching
@SpringBootApplication
//@Slf4j
public class SalesForceAuthApplication {
//    public class SalesForceAuthApplication implements CommandLineRunner {

    @Autowired
    CacheService cacheService;

    public static void main(String[] args) {
        SpringApplication.run(SalesForceAuthApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        String firstString = cacheService.cacheThis("Cache Key 1", UUID.randomUUID().toString());
//        //log.info("First: {}", firstString);
//        String secondString = cacheService.cacheThis("Cache Key 2", UUID.randomUUID().toString());
//        //log.info("Second: {}", secondString);
//        String thirdString = cacheService.cacheThis("Cache Key 3", UUID.randomUUID().toString());
//        //log.info("Third: {}", thirdString);
//        String fourthString = cacheService.cacheThis("Cache Key 4", UUID.randomUUID().toString());
//        //log.info("Fourth: {}", fourthString);
//    }

}
