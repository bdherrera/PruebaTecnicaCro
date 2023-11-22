package com.example.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PruebaTecnicaApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(PruebaTecnicaApplication.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/frontend/**")
                .addResourceLocations("classpath:/frontend/");
    }
}


