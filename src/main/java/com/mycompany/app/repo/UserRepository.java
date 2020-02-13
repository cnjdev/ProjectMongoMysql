package com.mycompany.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.mycompany.app.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();
    
    @Query("select u from User u where lower(u.name)=lower(:name)")
    List<User> findByName(String name);

}