package com.github.springdata.exceptionexample.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface OrderRepository extends MongoRepository<OrderDocument, ObjectId> {

    CompletableFuture<List<OrderDocument>> findByOrderIdIn(List<UUID> ids);
}
