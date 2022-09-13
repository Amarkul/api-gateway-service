package com.microservice.apigatewayservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HystrixController {

    @RequestMapping("/orderfallback")
    public Mono<String> orderServiceFallback(){
        return Mono.just("Order-Service is taking too long to respond or is down, please try again in some time...");
    }

    @RequestMapping("paymentfallback")
    public Mono<String> paymentServiceFallback(){
        return Mono.just("Payment-Service is taking too long to respond or is down, please try again in some time...");
    }
}
