package space.springbok.brewery.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import space.springbok.brewery.services.CustomerService;
import space.springbok.brewery.web.model.CustomerDTO;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(customerId)
                .name("John Spangenberg")
                .build();
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Klaas Puul")
                .build();
    }

    @Override
    public void update(UUID customerId, CustomerDTO customerDTO) {
    }

    @Override
    public void delete(UUID customerId) {
    }
}
