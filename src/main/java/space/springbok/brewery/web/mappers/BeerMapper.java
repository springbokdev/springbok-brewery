package space.springbok.brewery.web.mappers;

import org.mapstruct.Mapper;

import space.springbok.brewery.domain.Beer;
import space.springbok.brewery.web.model.BeerDTO;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
	
	BeerDTO toBeerDto(Beer beer);
	
	Beer toBeer(BeerDTO beerDto);

}
