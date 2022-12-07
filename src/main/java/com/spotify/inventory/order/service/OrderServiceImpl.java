package com.spotify.inventory.order.service;

import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.order.domin.OrderRepository;
import com.spotify.inventory.order.infrastructure.MySqlOrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final MySqlOrderRepository orderRepository;

    public OrderServiceImpl(MySqlOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
