package com.mytests.spring.mongo.test3.services;

import com.mytests.spring.mongo.test3.data.Employee;
import com.mytests.spring.mongo.test3.data.Persons;
import com.mytests.spring.mongo.test3.repos.EmployeeRepo;
import com.mytests.spring.mongo.test3.repos.PersonsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-mongo-test3</p>
 * *
 */
@Service
public class DisplayService {


    @Autowired
    private PersonsRepo personsRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    public void displayPersons(){
        System.out.println("=== persons tests: ===");
        for (Persons persons : personsRepo.findAll()) {
            System.out.println(persons);
        }
        System.out.println("=== byLastName: ===");
        for (Persons persons : personsRepo.findByPersonLastName("petrov")) {
            System.out.println(persons);
        }
    }
    public void displayEmployee(){
        System.out.println("=== employee tests: ===");
        for (Employee employee : employeeRepo.findAll()) {
            System.out.println(employee);
        }
    }
}
