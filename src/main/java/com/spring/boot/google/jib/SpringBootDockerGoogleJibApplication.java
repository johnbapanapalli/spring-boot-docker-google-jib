package com.spring.boot.google.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerGoogleJibApplication {
    @GetMapping("/googleJIB")
    public String googleJIB() {
        return "This is Google JIB Maven Plugin....";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerGoogleJibApplication.class, args);
    }

}
