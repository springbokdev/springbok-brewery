package space.springbok.brewery.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import space.springbok.brewery.services.BeerService;
import space.springbok.brewery.web.model.BeerDTO;

import java.util.UUID;

@Slf4j
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

    @Override
    public void delete(UUID beerId) {

    }
}
