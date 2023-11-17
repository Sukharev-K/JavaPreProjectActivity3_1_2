package com.example.JavaPreProjectActivity3_1_2.service;

import com.example.JavaPreProjectActivity3_1_2.model.User;
import com.example.JavaPreProjectActivity3_1_2.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public User showUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


    @Override
    public List<User> printUsers() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
