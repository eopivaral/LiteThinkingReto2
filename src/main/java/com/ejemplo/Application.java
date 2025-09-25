package com.ejemplo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Microservicio iniciado");
        SpringApplication.run(Application.class, args);
    }
}