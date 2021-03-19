package com.ufranco.apigateway.controllers;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class FallbackController extends AbstractGatewayFilterFactory {

  @GetMapping("/userServiceFallback")
  public String userFallback() {
    return "user route failed";
  }
  @GetMapping("/postServiceFallback")
  public String postFallback() {
    return "post route failed";
  }


  @Override
  public GatewayFilter apply(Object config) {
    return (exchange, chain) -> chain.filter(exchange);
  }
}
