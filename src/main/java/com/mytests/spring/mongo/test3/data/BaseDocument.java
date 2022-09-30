package com.mytests.spring.mongo.test3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Field;
//import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
public class BaseDocument {

    @Id
    BigInteger id;

    @Field("person_first_name")
    String personFirstName;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
    @Transient
    String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }
}
