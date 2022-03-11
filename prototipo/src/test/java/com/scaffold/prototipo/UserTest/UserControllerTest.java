package com.scaffold.prototipo.UserTest;
import static org.junit.jupiter.api.Assertions.*;

import com.scaffold.prototipo.controllers.UserController;
import com.scaffold.prototipo.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void createUser(){
        ResponseEntity<String> response= userController.createUserController(new User());
        assertEquals("usuario fue creado con exito", response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
    
    @Test
    public void createUserWrong(){
        ResponseEntity<String> response= userController.createUserController(null);
        assertEquals("usuario no fue creado con exito", response.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }

}
