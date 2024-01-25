package com.projeto.course.services;

import com.projeto.course.entities.Order;
import com.projeto.course.entities.User;
import com.projeto.course.repositories.OrderRepository;
import com.projeto.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository reporitory;

    public List<Order> findAll(){
        return reporitory.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = reporitory.findById(id);
        return obj.get();
    }
}
