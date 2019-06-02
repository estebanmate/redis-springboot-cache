package com.orangebank.boot.salesforce.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "cache")
@Data
public class CacheConfigurationProperties {

    private long timeoutSeconds = 10;
    private int redisPort = 6379;
    private String redisHost = "localhost";
    private int database=1;
    // Mapping of cacheNames to expira-after-write timeout in seconds
    private Map<String, Long> cacheExpirations = new HashMap<>();
}
