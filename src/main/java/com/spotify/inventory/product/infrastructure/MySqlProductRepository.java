package com.spotify.inventory.product.infrastructure;

import com.spotify.inventory.product.domin.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlProductRepository extends JpaRepository<Product, Long> {

}
