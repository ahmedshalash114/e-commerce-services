package com.ecommerce.backend.repository;

import com.ecommerce.backend.model.OrderEcommerce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEcommerceRepository extends JpaRepository<OrderEcommerce, Long> {
}
