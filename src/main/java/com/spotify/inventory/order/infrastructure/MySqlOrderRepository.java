package com.spotify.inventory.order.infrastructure;


import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.order.domin.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MySqlOrderRepository extends OrderRepository, JpaRepository<Order, Long> {

}
