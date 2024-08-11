package com.ecommerce.backend.controller;

import com.ecommerce.backend.model.OrderEcommerce;
import com.ecommerce.backend.service.OrderEcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderEcommerceController {

    @Autowired
    private OrderEcommerceService service;

    @GetMapping
    public List<OrderEcommerce> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrderEcommerce getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PostMapping
    public OrderEcommerce createOrder(@RequestBody OrderEcommerce order) {
        return service.saveOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}

