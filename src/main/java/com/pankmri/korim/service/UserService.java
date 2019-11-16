package com.pankmri.korim.service;

import com.pankmri.korim.entity.User;
import com.pankmri.korim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-12
 **/
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.getOne(userId);
    }
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public User getUser(String username) {
        return userRepository.findOneByUserName(username);
    }

}
