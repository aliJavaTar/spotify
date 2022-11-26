package com.spotify.inventory.order.infrastructure;

import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.order.domin.OrderRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MongoDbOrderRepository implements OrderRepository {
    private final MongoRepository<Order, Long> orderRepository;

    public MongoDbOrderRepository(MongoRepository<Order, Long> orderRepository) {
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
