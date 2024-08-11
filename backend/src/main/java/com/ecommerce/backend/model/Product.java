package com.ecommerce.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String sku;
    private String fullDescription;
    private BigDecimal price;
    private Integer vendorId;
    private BigDecimal discount;
    private LocalDateTime offerEnd;
    private Boolean isNew;
    private Integer rating;
    private Integer saleCount;
    private String category;
    private String tag;
    private Integer stock;
    private String image;
    private String shortDescription;
    private String weight;
    private String dimensions;
    private String materials;
    private String otherInfo;
    private String affiliateLink;

}
