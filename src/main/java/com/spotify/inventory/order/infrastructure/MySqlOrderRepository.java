package com.spotify.inventory.order.infrastructure;


import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.order.domin.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MySqlOrderRepository implements OrderRepository {

    private final DefaultOrderRepository orderRepository;

    public MySqlOrderRepository(DefaultOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
