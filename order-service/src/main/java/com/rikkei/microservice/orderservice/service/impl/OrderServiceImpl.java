package com.rikkei.microservice.orderservice.service.impl;

import com.rikkei.microservice.orderservice.repository.OrderRepository;
import com.rikkei.microservice.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public String getHealthCheck() {
        return "Order Service is Up";
    }
}
