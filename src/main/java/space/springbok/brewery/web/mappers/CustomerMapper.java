package space.springbok.brewery.web.mappers;

import org.mapstruct.Mapper;

import space.springbok.brewery.domain.Customer;
import space.springbok.brewery.web.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
	
	Customer toCustomer(CustomerDTO customerDTO);
	
	CustomerDTO toCustomerDto(Customer customer); 

}
