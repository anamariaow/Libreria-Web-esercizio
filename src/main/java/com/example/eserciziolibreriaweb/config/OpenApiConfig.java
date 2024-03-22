package com.example.eserciziolibreriaweb.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        Info info = new Info()
                .title("titolo generico")
                .version("1.0")
                .description("descrizione").termsOfService("https://google.com");

        return new OpenAPI().info(info);
    }

}
