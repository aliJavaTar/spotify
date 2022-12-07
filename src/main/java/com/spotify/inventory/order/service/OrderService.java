package com.spotify.inventory.order.service;

import com.spotify.inventory.order.domin.Order;

import java.util.Optional;

public interface OrderService {
    Order findById(Long id);

    Order save(Order order);
}
