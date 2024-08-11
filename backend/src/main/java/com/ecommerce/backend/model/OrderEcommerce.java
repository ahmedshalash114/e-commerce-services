package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_ecommerce")
@Data
public class OrderEcommerce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "status_code_id", nullable = false)
    private OrderStatusCode statusCode;

    private String customerComments;
    private Timestamp createdAt;
    private BigDecimal total;

}
