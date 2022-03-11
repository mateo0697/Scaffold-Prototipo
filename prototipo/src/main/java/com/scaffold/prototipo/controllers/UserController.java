package com.scaffold.prototipo.controllers;

import com.scaffold.prototipo.methods.UserMethods;
import com.scaffold.prototipo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController("/user")
public class UserController {

    @Autowired
    UserMethods userMethods;

    @PostMapping
    public ResponseEntity<String> createUserController(@RequestBody User user){
        User user2 = userMethods.createUserMethods(user);
        if (user2 == null){
            return new ResponseEntity<>("usuario no fue creado con exito", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("usuario fue creado con exito", HttpStatus.OK);
    }

}
