package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "shopping_cart_status")
@Data
public class ShoppingCartStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusCodeId;

    private String statusCode;
    private String description;

    @OneToMany(mappedBy = "statusCode")
    private List<ShoppingCart> shoppingCarts;

}
