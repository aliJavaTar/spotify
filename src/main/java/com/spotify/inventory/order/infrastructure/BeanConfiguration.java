package com.spotify.inventory.order.infrastructure;

import com.spotify.inventory.order.domin.DomainOrderService;
import com.spotify.inventory.order.domin.OrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    OrderService orderService(OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}