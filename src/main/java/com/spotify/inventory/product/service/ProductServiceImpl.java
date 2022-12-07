package com.spotify.inventory.product.service;

import com.spotify.inventory.product.domin.Product;
import com.spotify.inventory.product.infrastructure.DefaultProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final DefaultProductRepository repository;

    public ProductServiceImpl(DefaultProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return repository.save(product).orElseThrow(() -> new RuntimeException(""));
    }
}
