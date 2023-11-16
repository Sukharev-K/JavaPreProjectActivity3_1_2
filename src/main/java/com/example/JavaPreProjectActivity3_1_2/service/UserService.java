package com.example.JavaPreProjectActivity3_1_2.service;

import com.example.JavaPreProjectActivity3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> printUsers();
    User showUserById(Integer id);
    void save(User user);

    void delete(Integer id);
}
