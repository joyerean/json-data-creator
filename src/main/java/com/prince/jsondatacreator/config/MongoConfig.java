package com.prince.jsondatacreator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.prince.jsondatacreator.repository",})
public class MongoConfig {

}
