package com.marcosbarbero.wd.multiplemongo.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dd
 */
public interface SecondaryRepository extends MongoRepository<SecondaryModel, String> {
}
