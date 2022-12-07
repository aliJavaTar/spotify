package com.spotify.inventory.product.infrastructure;

import com.spotify.inventory.product.domin.Product;
import com.spotify.inventory.product.domin.ProductRepository;

import java.util.Optional;

public class DefaultProductRepository implements ProductRepository {
    private final MySqlProductRepository productRepository;

    public DefaultProductRepository(MySqlProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> save(Product product) {
        return Optional.of(productRepository.save(product));
    }
}
