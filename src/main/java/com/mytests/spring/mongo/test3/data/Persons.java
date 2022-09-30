package com.mytests.spring.mongo.test3.data;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
@Document("persons")
public class Persons extends BaseDocument
{
    //@Field("person_last_name")
    String person_last_name;

    public String getPerson_last_name() {
        return person_last_name;
    }

    public void setPerson_last_name(String person_last_name) {
        this.person_last_name = person_last_name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + getId() +
                ", personFirstName='" + getPersonFirstName() + '\'' +
                ", personLastName='" + person_last_name + '\'' +
                '}';
    }
}
