package com.ecommerce.backend.controller;



import com.ecommerce.backend.model.CustomerAddress;
import com.ecommerce.backend.service.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class CustomerAddressController {

    @Autowired
    private CustomerAddressService customerAddressService;

    @GetMapping
    public List<CustomerAddress> getAllCustomerAddresses() {
        return customerAddressService.getAllCustomerAddresses();
    }

    @GetMapping("/{id}")
    public Optional<CustomerAddress> getCustomerAddressById(@PathVariable Long id) {
        return customerAddressService.getCustomerAddressById(id);
    }

    @PostMapping
    public CustomerAddress createCustomerAddress(@RequestBody CustomerAddress customerAddress) {
        return customerAddressService.saveCustomerAddress(customerAddress);
    }

    @PutMapping("/{id}")
    public CustomerAddress updateCustomerAddress(@PathVariable Long id, @RequestBody CustomerAddress customerAddress) {
        customerAddress.setAddressId(id);
        return customerAddressService.saveCustomerAddress(customerAddress);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerAddress(@PathVariable Long id) {
        customerAddressService.deleteCustomerAddress(id);
    }
}
