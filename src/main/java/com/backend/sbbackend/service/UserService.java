package com.backend.sbbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.backend.sbbackend.model.UserDetails;
import com.backend.sbbackend.repository.UserRepository;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDetails getUserByTitle(String title) {
        return userRepository.findUserByTitle(title);
    }

    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDetails createUser(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

}
