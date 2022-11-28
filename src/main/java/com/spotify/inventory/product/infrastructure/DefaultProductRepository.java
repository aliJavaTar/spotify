package com.spotify.inventory.product.infrastructure;

import com.spotify.inventory.product.domin.Product;
import com.spotify.inventory.product.domin.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultProductRepository extends ProductRepository, JpaRepository<Product, Long> {
}
