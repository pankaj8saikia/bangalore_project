package com.pankmri.korim.rest.controller;

import com.pankmri.korim.entity.User;

import com.pankmri.korim.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-12
 **/
@Controller
@RequestMapping("/api/1.0/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class.getSimpleName());

    @Autowired
    UserService userService;


    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        //TODO :: dto validations
        //TODO :: DTO implementation and many things
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);

    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User existingUser = userService.getUser(user.getId());

        existingUser.setContactNumber(user.getContactNumber());
        existingUser.setEmail(user.getEmail());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setPassword(user.getPassword());
        User updatedUser = userService.updateUser(existingUser);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping(value = "/delete")
    @Transactional
    public ResponseEntity<String> deleteUser(@RequestParam(name = "user") String  username) {
        userService.deleteUser(userService.getUser(username));
        return ResponseEntity.ok("User " + username + " deleted successfully");
    }
    @GetMapping(value="/getuser")
    public ResponseEntity<User> getUser(@RequestParam(name = "user") String username) {
        User savedUser = userService.getUser(username);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping(value="/getusers")
    public ResponseEntity<List<User>> getUsesr() {
        List<User> savedUsers = userService.getUsers();
        return ResponseEntity.ok(savedUsers);
    }
}
