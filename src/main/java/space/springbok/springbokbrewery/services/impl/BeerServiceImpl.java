package space.springbok.springbokbrewery.services.impl;

import org.springframework.stereotype.Service;
import space.springbok.springbokbrewery.services.BeerService;
import space.springbok.springbokbrewery.web.model.BeerDTO;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDTO save(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        // TODO implement it
    }
}
