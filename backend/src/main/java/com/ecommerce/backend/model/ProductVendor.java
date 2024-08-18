package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "product_vendor")
@Data
public class ProductVendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    private Long vendorId;

    @Column(name = "company_code", nullable = false, length = 50)
    private String companyCode;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "address_street_no", nullable = false, length = 50)
    private String addressStreetNo;

    @Column(name = "address_street_name", nullable = false, length = 100)
    private String addressStreetName;

    @Column(name = "address_city", nullable = false, length = 50)
    private String addressCity;

    @Column(name = "address_state", length = 50)
    private String addressState;

    @Column(name = "address_postal_code", nullable = false, length = 25)
    private String addressPostalCode;

    @Column(name = "address_country_code", nullable = false, length = 2)
    private String addressCountryCode;
}
