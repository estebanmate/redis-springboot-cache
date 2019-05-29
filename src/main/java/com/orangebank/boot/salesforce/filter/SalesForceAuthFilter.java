package com.orangebank.boot.salesforce.filter;

import com.masmovil.it.ticket.service.TokenSalesForceService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.ClientFilterChain;
import io.micronaut.http.filter.HttpClientFilter;

import org.reactivestreams.Publisher;

@Filter("/${salesforce.api-version}/**")
public class SalesForceAuthFilter implements HttpClientFilter {
  protected final TokenSalesForceService tokenSalesForceService;

  public SalesForceAuthFilter(TokenSalesForceService tokenSalesForceService) {
    this.tokenSalesForceService = tokenSalesForceService;
  }

  /**
   * @param targetRequest The target request.
   * @param chain         The filter chain.
   * @return The publisher of the response.
   */
  @Override
  public Publisher<? extends HttpResponse<?>> doFilter(
      MutableHttpRequest<?> targetRequest, ClientFilterChain chain) {
    targetRequest.bearerAuth(tokenSalesForceService.getToken());
    return chain.proceed(targetRequest);
  }
}