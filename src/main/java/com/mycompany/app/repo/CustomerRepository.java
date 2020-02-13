package com.mycompany.app.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mycompany.app.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByFirstName(String firstName);
    
    public List<Customer> findByLastName(String lastName);

    @Query("{'$and' : [ {'firstName' : ?0}, {'lastName' : ?1} ] }")
    public List<Customer> findByName(String firstName, String lastName);

}