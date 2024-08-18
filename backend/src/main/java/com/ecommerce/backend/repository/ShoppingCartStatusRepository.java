package com.ecommerce.backend.repository;

import com.ecommerce.backend.model.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartStatusRepository extends JpaRepository<ShoppingCartStatus, Long> {
    @Override
    Optional<ShoppingCartStatus> findById(Long shippingCartStatusId);
}
