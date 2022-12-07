package com.spotify.inventory.order.infrastructure;

import com.spotify.inventory.order.domin.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultOrderRepository extends JpaRepository<Order, Long> {
}
