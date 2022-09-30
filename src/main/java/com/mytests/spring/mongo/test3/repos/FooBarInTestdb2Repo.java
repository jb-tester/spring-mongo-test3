package com.mytests.spring.mongo.test3.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * <p>Repository for the collection from different DB</p>
 * <p>that has the same name as the collection in the current DB</p>
 * <p>No completion for fields is available</p>
 */
public interface FooBarInTestdb2Repo extends MongoRepository<FooBarInTestdb2Repo, BigInteger> {
    @Query("{}")
    List<FooBarInTestdb2Repo> qwe1();
}
