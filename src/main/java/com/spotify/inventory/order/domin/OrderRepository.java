package com.spotify.inventory.order.domin;

import java.util.Optional;

public interface OrderRepository {

    Optional<Order> findById(Long id);

    Order save(Order order);
}
