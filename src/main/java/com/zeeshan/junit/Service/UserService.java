package com.zeeshan.junit.Service;

import com.zeeshan.junit.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(String id){
        return "Zeeshan";
    }

    public String getUser(User user){
        return "user";
    }
}
