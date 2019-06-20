package com.lhfeiyu.tech.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TechGatewayServerApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/google").uri("http://google.com:80/").id("google_route")
                ).build();

    }

    public static void main(String[] args) {
        SpringApplication.run(TechGatewayServerApplication.class, args);
    }

}
