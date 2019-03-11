package com.jesse.reactiveWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ReactiveWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveWebDemoApplication.class, args);
    }


}
