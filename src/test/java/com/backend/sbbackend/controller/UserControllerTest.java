package com.backend.sbbackend.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.backend.sbbackend.service.UserService;

@WebMvcTest(UserController.class)
@Disabled("Ignoring all tests in UserControllerTest")
public class UserControllerTest {

    @MockBean
    private UserService userService;

    @Test
    public void testGetUserById() throws Exception {
        // Write your test case here
    }

    @Test
    public void testCreateUser() throws Exception {
        // Write your test case here
    }

    @Test
    public void testUpdateUser() throws Exception {
        // Write your test case here
    }

    @Test
    public void testDeleteUser() throws Exception {
        // Write your test case here
    }
}