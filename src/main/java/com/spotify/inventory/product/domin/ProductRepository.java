package com.spotify.inventory.product.domin;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> save(Product product);
}
