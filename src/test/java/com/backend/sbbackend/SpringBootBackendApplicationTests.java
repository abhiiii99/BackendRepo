package com.backend.sbbackend;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.backend.sbbackend.repository.UserRepository;




@SpringBootTest
public class SpringBootBackendApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		// Test to ensure the Spring application context loads successfully
	}

	@Test
	void userRepositoryIsNotNull() {
		// Test to verify that the UserRepository bean is correctly injected
		assertNotNull(userRepository, "UserRepository should not be null");
	}
}