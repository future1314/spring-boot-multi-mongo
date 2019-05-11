package com.dd.demo.multiplemongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static com.dd.demo.multiplemongo.config.SecondaryMongoConfig.MONGO_TEMPLATE;

/**
 * @author dd
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.dd.demo.multiplemongo.repository.secondary",
        mongoTemplateRef = MONGO_TEMPLATE)
public class SecondaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
