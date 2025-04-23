package com.corhuila.app_movil_g2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Reserva API", version = "1.0", description = "API para gestionar reservas"))
public class SwaggerConfig {
}