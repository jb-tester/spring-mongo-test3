package com.mytests.spring.mongo.test3.repos;

import com.mytests.spring.mongo.test3.data.Employee;
import com.mytests.spring.mongo.test3.data.Persons;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */

public interface EmployeeRepo extends MongoRepository<Employee, BigInteger> {

    @Query("{Full_Name: ?0, Sick_Days: ?2, Project: ?1}")
    List<Employee> qwe(String a1, String a2, Integer a3);
}
