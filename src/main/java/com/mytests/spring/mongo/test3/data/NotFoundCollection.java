package com.mytests.spring.mongo.test3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
@Document("dummy")
public class NotFoundCollection {
    @Id
    BigInteger id;
    String first;
    String second;
    String third;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }
}
