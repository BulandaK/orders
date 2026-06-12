package com.example.orders.service;

import com.example.orders.dto.order.CreateOrderCommand;
import com.example.orders.dto.order.OrderResponseDto;
import com.example.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderResponseDto create(CreateOrderCommand command) {

        return null;
    }
}
