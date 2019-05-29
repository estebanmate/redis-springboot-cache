package com.orangebank.boot.salesforce.client;

import com.masmovil.it.ticket.model.salesforce.TokenSalesForce;
import com.masmovil.it.ticket.repository.redis.RedisKeyGenerator;

import io.micronaut.cache.annotation.CacheConfig;
import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;

@Client("${token.url}")
@Retryable(delay = "200ms")
@CacheConfig("salesforcetoken")
public interface SalesForceAuthClient {

  @Post("/${token.endpoint}?"
      + "grant_type=${token.grant-type}"
      + "&client_id=${token.client-id}"
      + "&client_secret=${token.client-secret}"
      + "&username=${token.username}"
      + "&password=${token.password}")
  @Cacheable(keyGenerator = RedisKeyGenerator.class)
  public TokenSalesForce getToken();

}
