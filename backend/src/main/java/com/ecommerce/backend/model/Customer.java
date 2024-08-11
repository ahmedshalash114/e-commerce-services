package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String emailAddress;

    private LocalDateTime createdAt;

    private String username;

    private String userType;

}
