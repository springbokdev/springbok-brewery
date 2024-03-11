package space.springbok.brewery.services;

import space.springbok.brewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO save(CustomerDTO customerDTO);

    void update(UUID customerId, CustomerDTO customerDTO);

    void delete(UUID customerId);
}
