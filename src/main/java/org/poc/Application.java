package org.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Main class to bootstrap Spring Boot application
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    // Main method to start the application
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}