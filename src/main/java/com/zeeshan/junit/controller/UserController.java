package com.zeeshan.junit.controller;

import com.zeeshan.junit.Service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable(name = "id") String Id){
    String res = userService.getUserById(Id);
    if(res!=null || !res.equals("")){
        res = res.toUpperCase();
    }
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
