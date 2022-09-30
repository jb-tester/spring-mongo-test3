package com.mytests.spring.mongo.test3;

import com.mytests.spring.mongo.test3.services.DisplayService;
import com.mytests.spring.mongo.test3.services.FooBarSetup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoTest3Application implements CommandLineRunner {

    @Autowired
    private DisplayService displayService;
    @Autowired
    private FooBarSetup fooBarSetup;

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoTest3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //fooBarSetup.initFooBar();
        displayService.displayPersons();
        displayService.displayEmployee();

    }
}
