package com.kh.demo.service;

import com.kh.demo.entity.one_to_one.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(Long id, User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    String deleteUser(Long id);
}
