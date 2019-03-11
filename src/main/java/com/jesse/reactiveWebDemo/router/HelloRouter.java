package com.jesse.reactiveWebDemo.router;

import com.jesse.reactiveWebDemo.handler.HelloHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

@Configuration
public class HelloRouter {
    @Bean
    public RouterFunction<ServerResponse> route(HelloHandler cityHandler) {

        BinaryOperator<Long> binaryOperator = (Long x, Long y) -> x + y;
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::hello);
    }
}
