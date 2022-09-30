package com.mytests.spring.mongo.test3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * <p>This document is contained in different db - <b>testdb2#foobar</b> </p>
 * <p> and its column names differ from ones in testdb1#foobar</p>
 */
@Document(value = "foobar")
public class FooBarInTestdb2 {

    @Id
    BigInteger id;
    String firstName;
    @Field("lastName")
    String surname;
    @Field("fooField")
    String foo;
    String barField;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBarField() {
        return barField;
    }

    public void setBarField(String barField) {
        this.barField = barField;
    }

    public FooBarInTestdb2(String name, String surname, String foo, String bar) {
        this.firstName = name;
        this.surname = surname;
        this.foo = foo;
        this.barField = bar;
    }
}
