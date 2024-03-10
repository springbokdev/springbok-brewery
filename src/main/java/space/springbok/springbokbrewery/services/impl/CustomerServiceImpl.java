package space.springbok.springbokbrewery.services.impl;

import org.springframework.stereotype.Service;
import space.springbok.springbokbrewery.services.CustomerService;
import space.springbok.springbokbrewery.web.model.CustomerDTO;

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
