package com.pd.gateway.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator getewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/currency-conversion/**")
                        .uri("lb://converter-service"))
                .route(p -> p.path("/currency-exchange/**")
                        .uri("lb://exchange-service"))
                .build();
    }
}

