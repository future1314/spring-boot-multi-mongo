package com.dd.demo.multiplemongo.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author dd
 */
@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

    private MongoProperties primary = new MongoProperties();//根据属性和配置文件 自动匹配。。。。。。
    private MongoProperties secondary = new MongoProperties();
}
