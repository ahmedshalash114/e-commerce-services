package com.ecommerce.backend.service;

import com.ecommerce.backend.model.Customer;
import com.ecommerce.backend.model.ShoppingCart;
import com.ecommerce.backend.model.ShoppingCartItem;
import com.ecommerce.backend.model.ShoppingCartStatus;
import com.ecommerce.backend.repository.CustomerRepository;
import com.ecommerce.backend.repository.ShoppingCartItemRepository;
import com.ecommerce.backend.repository.ShoppingCartRepository;
import com.ecommerce.backend.repository.ShoppingCartStatusRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

  @Autowired
  private ShoppingCartRepository shoppingCartRepository ;

  @Autowired
  private ShoppingCartItemRepository shoppingCartItemRepository;

  @Autowired
  private  CustomerService  customerService ;


  @Autowired
   private ShoppingCartStatusRepository shoppingCartStatusRepository;

    @Transactional
    public ShoppingCart addToCart(ShoppingCart shoppingCart) {

        ShoppingCart tempShoppingCart = new ShoppingCart();

        Optional<ShoppingCartStatus> shoppingCartStatus = shoppingCartStatusRepository.findById(1L);
        Optional<Customer> customer = customerService.getCustomerById(1L);

        if (customer.isPresent()) {
            tempShoppingCart.setCustomer(customer.get());
            tempShoppingCart.setStatusCode(shoppingCartStatus.get());
            Date todayDate = new Date();
            tempShoppingCart.setCreatedAt(new Timestamp(todayDate.getTime()));

            // Initialize items if null
            if (shoppingCart.getItems() == null) {
                shoppingCart.setItems(new ArrayList<>());
            }

            tempShoppingCart.setItems(shoppingCart.getItems());
        }

        shoppingCart = shoppingCartRepository.save(tempShoppingCart);

        for (ShoppingCartItem shopCartItem : shoppingCart.getItems()) {
            shopCartItem.setCart(shoppingCart);
        }

        List<ShoppingCartItem> shoppingCartItemList = shoppingCartItemRepository.saveAll(shoppingCart.getItems());

        shoppingCart.setItems(shoppingCartItemList);

        return shoppingCartRepository.save(shoppingCart);
    }

}
