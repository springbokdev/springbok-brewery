package space.springbok.springbokbrewery.services;

import org.springframework.stereotype.Service;
import space.springbok.springbokbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

}
