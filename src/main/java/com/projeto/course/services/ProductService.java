package com.projeto.course.services;

import com.projeto.course.entities.Product;
import com.projeto.course.entities.User;
import com.projeto.course.repositories.ProductRepository;
import com.projeto.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository reporitory;

    public List<Product> findAll(){
        return reporitory.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = reporitory.findById(id);
        return obj.get();
    }
}
