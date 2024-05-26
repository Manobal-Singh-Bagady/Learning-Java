package com.msb.learningspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearningSpringFrameworkApplication{
    public static void main(String[] args) {
        // Start the Spring Application.
        SpringApplication.run(LearningSpringFrameworkApplication.class, args);
    }

    @GetMapping("/")
    public Object root() {
        return new Object() {
            public final String message = "Hello World!";
        };
    }

    @GetMapping("/hello")
    public Object hello(@RequestParam(defaultValue = "User") String name) {
        return new Object() {
            public final String title = "Hello World!";
            public final String message = String.format("Hello %s, Welcome to Spring Boot!", name);
        };
    }

    @GetMapping("/age")
    public Object hello(@RequestParam(defaultValue = "10") int age) {
        return new Object() {
            public final String title = "Hello World!";
            public final String message = String.format("Hello %d, Welcome to Spring Boot!", age);
        };
    }
}
