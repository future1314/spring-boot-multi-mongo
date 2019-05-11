package com.dd.demo.multiplemongo.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dd
 */
public interface PrimaryRepository extends MongoRepository<PrimaryModel, String> {
}
