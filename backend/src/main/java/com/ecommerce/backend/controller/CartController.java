package com.ecommerce.backend.controller;


import com.ecommerce.backend.model.Customer;
import com.ecommerce.backend.model.ShoppingCart;
import com.ecommerce.backend.model.ShoppingCartItem;
import com.ecommerce.backend.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/add")
    public ShoppingCart createCart(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.addToCart(shoppingCart);
    }

}
