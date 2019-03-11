package com.jesse.reactiveWebDemo.controller;

import com.jesse.reactiveWebDemo.domain.Man;
import com.jesse.reactiveWebDemo.handler.HelloHandler;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/man")
public class ManController {
    @Autowired
    private HelloHandler helloHandler;

    @GetMapping
    public Flux<Man> findCity() {
        return helloHandler.findAllCity();
    }

    @GetMapping(value = "/{id}")
    public Mono<Man> findCity(@PathVariable ObjectId id) {
        return helloHandler.findCityById(id);
    }

    @PostMapping()
    public Mono<Man> saveCity(@RequestBody Man city) {
        return helloHandler.save(city);
    }
}
