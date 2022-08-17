package com.educacionit.ej07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class Ej07Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej07Application.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("V1") String appVersion) {
		return new OpenAPI().info(new Info().title("API de prueba de Películas")
				.version(appVersion)
				.description("API para sugerir peliculas")
				.termsOfService("http://google.com.ar")
				.license(new License().name("Apache 2.0").url("http://google.com.ar")));
	}
}
