package com.zeeshan.junit.controller;

import com.zeeshan.junit.Service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class UserControllerTest {

    private MockMvc mockMvc;
    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    //@Test
    public void testController1() throws Exception{
        String id ="2";
        String resp = "Zeeshan";
        when(userService.getUserById(anyString())).thenReturn(resp);

        mockMvc.perform(get("/api/v1/users/{id}", id)).andExpect(status().isOk());

    }

    @Test
    public void testController2() throws Exception{
        String id ="2";
        String resp = "Zeeshan";
        when(userService.getUserById(anyString())).thenReturn(null);

        mockMvc.perform(get("/api/v1/users/{id}", id)).andExpect(status().isOk());

    }
}
