package com.spotify.inventory.order.infrastructure;

import com.spotify.inventory.order.domin.Order;

import java.util.Optional;

public interface OrderService {
    Optional<Order> findById(Long id);

    Order save(Order order);
}
