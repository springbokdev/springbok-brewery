package space.springbok.brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import space.springbok.brewery.web.model.v2.BeerStyleEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	
	 private UUID id;

	 private String beerName;

	 private BeerStyleEnum beerStyle;

	 private Long upc;
	 
	 private Timestamp createdDate;
	 private Timestamp lastUpdatedDate;
	 
	  

}
