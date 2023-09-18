package com.keikai713.SpringBootWebPage.controllers;

import com.keikai713.SpringBootWebPage.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
@RequestMapping(value = "user/{id}")
public User getUser(@PathVariable Long id) {
    User user = new User();
    user.setId(id);
    user.setName("Juan");
    user.setLastname("Gomez");
    user.setEmail("juangomez.gmail.com");
    user.setPhone("5466558314");
    return user;
    }

@RequestMapping(value = "user54")
public User modifyUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastname("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }

@RequestMapping(value = "user545")
public User deelteUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastname("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }

@RequestMapping(value = "user5454")
public User searchUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastname("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }
}
