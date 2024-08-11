package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_status_code")
@Data
public class OrderStatusCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusCodeId;

    private String statusCode;
    private String description;

}

