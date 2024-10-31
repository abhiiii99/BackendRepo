package com.backend.sbbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.backend.sbbackend.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootBackendApplication {

	@Autowired
    UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

}
