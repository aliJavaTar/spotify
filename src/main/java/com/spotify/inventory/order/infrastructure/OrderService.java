package com.spotify.inventory.order.infrastructure;

import com.spotify.inventory.order.domin.Order;
import org.aspectj.weaver.ast.Or;

import java.util.Optional;

public interface OrderService {
    Optional<Order> findById(Long id);

    Order save(Order order);
}
