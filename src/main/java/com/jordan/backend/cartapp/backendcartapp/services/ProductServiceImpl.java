package com.jordan.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jordan.backend.cartapp.backendcartapp.models.entities.Product;
import com.jordan.backend.cartapp.backendcartapp.repositories.ProductRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
    
}
