package com.example.orders.controller;

import com.example.orders.dto.order.CreateOrderCommand;
import com.example.orders.dto.order.OrderResponseDto;
import com.example.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public OrderResponseDto create(@RequestBody CreateOrderCommand command) {
        return orderService.create(command);
    }
}
