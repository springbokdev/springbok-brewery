package space.springbok.brewery.services;

import space.springbok.brewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO save(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);
}
