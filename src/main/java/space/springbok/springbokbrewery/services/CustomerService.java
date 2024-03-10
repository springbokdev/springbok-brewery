package space.springbok.springbokbrewery.services;

import space.springbok.springbokbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
