package space.springbok.brewery.web.controller.v2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.springbok.brewery.web.model.v2.BeerDTOV2;
import space.springbok.brewery.services.v2.BeerServiceV2;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
@RequiredArgsConstructor
public class BeerControllerV2 {

    private final BeerServiceV2 beerServiceV2;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTOV2> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDTOV2 beerDTO) {
        BeerDTOV2 savedDTO = beerServiceV2.save(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDTO.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTOV2 beerDTO) {
        beerServiceV2.updateBeer(beerId, beerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerId) {
        beerServiceV2.delete(beerId);
    }
}
