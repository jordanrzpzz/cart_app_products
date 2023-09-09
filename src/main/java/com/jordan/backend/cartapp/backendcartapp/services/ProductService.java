package com.jordan.backend.cartapp.backendcartapp.services;

import java.util.List;
import com.jordan.backend.cartapp.backendcartapp.models.entities.Product;


public interface ProductService {
    List<Product> findAll();

    
}
