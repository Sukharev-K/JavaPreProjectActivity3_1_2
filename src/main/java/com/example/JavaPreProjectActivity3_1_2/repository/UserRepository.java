package com.example.JavaPreProjectActivity3_1_2.repository;

import com.example.JavaPreProjectActivity3_1_2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {

}
