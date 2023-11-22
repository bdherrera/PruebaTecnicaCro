package com.example.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = "com.example.pruebatecnica.dto")
public class PruebaTecnicaApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(PruebaTecnicaApplication.class, args);
    }

}


