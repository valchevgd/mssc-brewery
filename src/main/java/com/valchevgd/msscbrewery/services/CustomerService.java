package com.valchevgd.msscbrewery.services;

import com.valchevgd.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
