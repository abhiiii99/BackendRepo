package com.backend.sbbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.backend.sbbackend.model.UserDetails;

public interface UserRepository extends MongoRepository<UserDetails, String> {
    @Query("{title:'?0'}")
    UserDetails findUserByTitle(String name);
    
    // @Query(value="{decription:'?0'}", fields="{'title' : 1, 'decription' : 1}")
    // List<UserDetails> findAll(String category);
    
    public long count();
}
