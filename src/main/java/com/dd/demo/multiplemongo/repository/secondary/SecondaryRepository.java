package com.dd.demo.multiplemongo.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dd
 */
public interface SecondaryRepository extends MongoRepository<SecondaryModel, String> {
}
