package com.mytests.spring.mongo.test3.repos;

import com.mytests.spring.mongo.test3.data.NotFoundCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * <p>Repository for the class that is not found in DB</p>
 * <p> No fields are available for completion</p>
 * *
 */
public interface DummyRepo extends MongoRepository<NotFoundCollection, BigInteger>
{
    @Query("{}")
    List<NotFoundCollection> qwe1();
}
