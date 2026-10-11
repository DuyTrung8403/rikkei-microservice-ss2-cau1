package com.rikkei.microservice.orderservice.controller;

import com.rikkei.microservice.orderservice.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderControllerTest {

    @Test
    void testHealthCheck() {
        OrderService orderService = Mockito.mock(OrderService.class);
        Mockito.when(orderService.getHealthCheck()).thenReturn("Order Service is Up");

        OrderController controller = new OrderController(orderService);
        String response = controller.healthCheck();

        Assertions.assertEquals("Order Service is Up", response);
    }
}
