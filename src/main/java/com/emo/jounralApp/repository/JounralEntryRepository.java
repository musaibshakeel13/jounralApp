
package com.emo.jounralApp.repository;

import com.emo.jounralApp.Entity.JounralEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JounralEntryRepository extends MongoRepository<JounralEntry,String> {
}


