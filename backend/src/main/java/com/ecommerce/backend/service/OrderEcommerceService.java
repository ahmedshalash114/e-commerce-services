package com.ecommerce.backend.service;

import com.ecommerce.backend.model.OrderEcommerce;
import com.ecommerce.backend.repository.OrderEcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderEcommerceService {

    @Autowired
    private OrderEcommerceRepository repository;

    public List<OrderEcommerce> getAllOrders() {
        return repository.findAll();
    }

    public OrderEcommerce getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public OrderEcommerce saveOrder(OrderEcommerce order) {
        return repository.save(order);
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}

