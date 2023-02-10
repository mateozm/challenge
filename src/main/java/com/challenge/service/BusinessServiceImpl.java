package com.challenge.service;

import com.challenge.entity.Product;
import com.challenge.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService{

    private final ProductRepository productRepository;

    public BusinessServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    /*Just to test if code compile besides must return dto not entity*/
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
