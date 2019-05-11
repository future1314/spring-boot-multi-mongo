package com.dd.demo.multiplemongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static com.dd.demo.multiplemongo.config.PrimaryMongoConfig.MONGO_TEMPLATE;

/**
 * @author dd
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.dd.demo.multiplemongo.repository.primary",
        mongoTemplateRef = MONGO_TEMPLATE)
public class PrimaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
