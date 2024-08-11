package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer_address")
@Data
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private String addressStreetNo;

    private String addressStreetName;

    private String addressCity;

    private String addressState;

    private String addressPostalCode;

    private String addressCountryCode;

}
