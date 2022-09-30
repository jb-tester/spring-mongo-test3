package com.mytests.spring.mongo.test3.repos;

import com.mytests.spring.mongo.test3.data.FooBar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * <p>The columns from the found DB collection are available in completion </p>
 * <p>column types displayed in completion are taken from</p>
 * <p>the corresponding class fields if they have @Field annotations</p>
 */
public interface FooBarRepo extends MongoRepository<FooBar, BigInteger> {
    // try completion - https://youtrack.jetbrains.com/issue/IDEA-298415/Spring-Data-MongoDB-JSON-queries-the-field-type-is-shown-in-completion-only-for-fields-annotated-with-Field
    @Query("{}")
    List<FooBar> qwe1();
}
