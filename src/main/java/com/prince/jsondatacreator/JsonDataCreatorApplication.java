package com.prince.jsondatacreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JsonDataCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDataCreatorApplication.class, args);
	}

}
