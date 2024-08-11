package com.ecommerce.backend.service;

import com.ecommerce.backend.model.CustomerAddress;
import com.ecommerce.backend.repository.CustomerAddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerAddressService {

    @Autowired
    private CustomerAddressRepository customerAddressRepository;

    public List<CustomerAddress> getAllCustomerAddresses() {
        return customerAddressRepository.findAll();
    }

    public Optional<CustomerAddress> getCustomerAddressById(Long addressId) {
        return customerAddressRepository.findById(addressId);
    }

    public CustomerAddress saveCustomerAddress(CustomerAddress customerAddress) {
        return customerAddressRepository.save(customerAddress);
    }

    public void deleteCustomerAddress(Long addressId) {
        customerAddressRepository.deleteById(addressId);
    }
}

