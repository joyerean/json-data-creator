package com.prince.jsondatacreator;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public GroupedOpenApi api() {
		return GroupedOpenApi.builder()
				.group("JsonDataCreatorControllers")
				.pathsToMatch("/api/**")
				.packagesToScan("com.prince.jsondatacreator.api")
				.build();
	}

}
