package com.zeeshan.junit;

import com.zeeshan.junit.Service.UserService;
import com.zeeshan.junit.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testGetUserById(){
        String msg = userService.getUserById("1");
        Assertions.assertEquals("Zeeshan",msg);
    }
    @Test
    public void testGetUser(){
        String user = userService.getUser(new User("1","Zeeshan"));
        Assertions.assertEquals("user",user);
    }
}
