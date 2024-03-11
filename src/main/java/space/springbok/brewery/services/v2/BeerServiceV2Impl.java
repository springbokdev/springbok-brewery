package space.springbok.brewery.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import space.springbok.brewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDTOV2 save(BeerDTOV2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void delete(UUID beerId) {

    }
}
