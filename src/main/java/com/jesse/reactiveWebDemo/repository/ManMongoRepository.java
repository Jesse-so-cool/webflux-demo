package com.jesse.reactiveWebDemo.repository;

import com.jesse.reactiveWebDemo.domain.Man;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManMongoRepository extends ReactiveMongoRepository<Man, ObjectId> {

}
