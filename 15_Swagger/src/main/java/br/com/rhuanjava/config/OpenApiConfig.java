package br.com.rhuanjava.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
     OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with Java and Spring Boot")
                        .version("v1")
                        .description("")
                        .termsOfService("https://rhuandev.com.br/")
                        .license(new License().name("Apache 2.0").url("https://rhuandev.com.br/")));
    }
}
