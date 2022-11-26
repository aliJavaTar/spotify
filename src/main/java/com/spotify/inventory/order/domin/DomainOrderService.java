package com.spotify.inventory.order.domin;

import com.spotify.inventory.order.infrastructure.OrderService;

import java.util.Optional;

public record DomainOrderService(
        OrderRepository orderRepository) implements OrderService {


    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
