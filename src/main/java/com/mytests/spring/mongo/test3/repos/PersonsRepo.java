package com.mytests.spring.mongo.test3.repos;

import com.mytests.spring.mongo.test3.data.Persons;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */

public interface PersonsRepo extends MongoRepository<Persons, BigInteger> {

  @Query("{person_last_name: {$eq: ?0}}")
  List<Persons> findByPersonLastName(String name);

  @Query("{person_first_name: {$eq: ?0}, id: {$ne: null}}")
  List<Persons> findByFirstName(String name);
}
