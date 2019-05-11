package com.marcosbarbero.wd.multiplemongo.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dd
 */
public interface PrimaryRepository extends MongoRepository<PrimaryModel, String> {
}
