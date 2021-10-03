package com.kafka.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;




@Configuration
public class SwaggerConfig {
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new 
             Info().title("Kafka consumer api").version("1.0").description("events to be consumed"))
                .addSecurityItem(new SecurityRequirement().addList("Provide Jwt token"))
                .components(new Components().addSecuritySchemes("Jwt security", new SecurityScheme().name("Jwt security").type(SecurityScheme.Type.HTTP).scheme("bearer")));
    }
}
