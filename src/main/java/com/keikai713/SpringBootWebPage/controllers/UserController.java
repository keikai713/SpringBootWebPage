package com.keikai713.SpringBootWebPage.controllers;

import com.keikai713.SpringBootWebPage.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
@RequestMapping(value = "user/{id}")
public User getUser(@PathVariable Long id) {
    User user = new User();
    user.setId(id);
    user.setName("Juan");
    user.setLastName("Gomez");
    user.setEmail("juangomez.gmail.com");
    user.setPhone("5466558314");
    return user;
    }

    @RequestMapping(value = "users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setName("Juan");
        user.setLastName("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Maria");
        user2.setLastName("Gil");
        user2.setEmail("mariagil.gmail.com");
        user2.setPhone("5466558310");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Jose");
        user3.setLastName("Oleo");
        user3.setEmail("joseoleo.gmail.com");
        user3.setPhone("5466558311");

        users.add(user);
        users.add(user2);
        users.add(user3);
        return users;
    }

@RequestMapping(value = "user54")
public User modifyUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastName("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }

@RequestMapping(value = "user545")
public User deelteUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastName("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }

@RequestMapping(value = "user5454")
public User searchUser() {
        User user = new User();
        user.setName("Juan");
        user.setLastName("Gomez");
        user.setEmail("juangomez.gmail.com");
        user.setPhone("5466558314");
        return user;
    }
}
