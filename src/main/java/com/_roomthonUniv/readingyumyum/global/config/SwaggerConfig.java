package com._roomthonUniv.readingyumyum.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info()
			.title("독서냠냠 API")
			.description("독셔 냠냠 API 명세서");

		return new OpenAPI()
			.info(info)
			.components(new Components());
	}
}