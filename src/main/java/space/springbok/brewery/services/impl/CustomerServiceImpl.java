package space.springbok.brewery.services.impl;

import org.springframework.stereotype.Service;
import space.springbok.brewery.services.CustomerService;
import space.springbok.brewery.web.model.CustomerDTO;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(customerId)
                .name("John Spangenberg")
                .build();
    }
}
