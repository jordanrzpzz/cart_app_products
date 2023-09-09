package com.jordan.backend.cartapp.backendcartapp.controllers;

import com.jordan.backend.cartapp.backendcartapp.models.entities.Product;
import com.jordan.backend.cartapp.backendcartapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.findAll();
    }

}
