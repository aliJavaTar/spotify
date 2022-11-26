package com.spotify.inventory.order.presentation;

import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.order.infrastructure.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(@Qualifier("orderServiceMySql") OrderService orderService) {
        this.orderService = orderService;
    }

    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.save(order), HttpStatus.OK);
    }
}
