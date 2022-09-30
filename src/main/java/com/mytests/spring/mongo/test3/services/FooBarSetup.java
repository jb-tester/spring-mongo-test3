package com.mytests.spring.mongo.test3.services;

import com.mytests.spring.mongo.test3.data.FooBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
@Service
public class FooBarSetup {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void initFooBar(){
        mongoTemplate.dropCollection("foobar");
        List<FooBar> foos = List.of(
                                 new FooBar("vasya","pupkin","foo vasya", "bar vasya")
                                 ,new FooBar("vanya","ivanov","foofoo", "barbar")
                                 ,new FooBar("vasya","ivanov","foo vasya", "bar vasya")
                                 ,new FooBar("masha","pupkina","not foo", "not bar")
                                 ,new FooBar("nadia","popova","something", "nothing")
                                 ,new FooBar("nastya","nadina","nothing", "nothing")
                                 ,new FooBar("sasha","aleksandrov","just foo", "some bar")
                                 ,new FooBar("dasha","petrova","something", "something")
                                   );
        mongoTemplate.insertAll(foos);
    }
}
