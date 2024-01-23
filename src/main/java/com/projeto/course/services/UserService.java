package com.projeto.course.services;

import com.projeto.course.entities.User;
import com.projeto.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository reporitory;

    public List<User> findAll(){
        return reporitory.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = reporitory.findById(id);
        return obj.get();
    }
}
