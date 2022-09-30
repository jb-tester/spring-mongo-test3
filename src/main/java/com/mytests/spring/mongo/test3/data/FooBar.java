package com.mytests.spring.mongo.test3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;

/**
 * *
 * <p>Created by irina on 9/30/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
@Document(value = "foobar")
public class FooBar {

    @Id
    BigInteger id;
    @Field("name")
    String firstName;
    @Field
    String surname;
    String foo;
    @Field("bar")
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

    public FooBar(String name, String surname, String foo, String bar) {
        this.firstName = name;
        this.surname = surname;
        this.foo = foo;
        this.barField = bar;
    }
}
