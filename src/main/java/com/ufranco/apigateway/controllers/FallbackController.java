package com.ufranco.apigateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

  @GetMapping("/userms")
  public String userFallback() {
    return "user route failed";
  }

  @GetMapping("/mailms")
  public String postFallback() {
    return "post route failed";
  }

}
