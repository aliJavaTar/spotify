package com.spotify.inventory.order.domin;

import java.util.Optional;

public interface OrderRepository {

    Optional<Order> findById();

    void save(Order order);
}
