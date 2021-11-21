package test.osmrest.osmrest.api;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.osmrest.osmrest.client.model.MapObject;
import test.osmrest.osmrest.exception.handler.exception.NoSuchRestException;
import test.osmrest.osmrest.service.GeoService;


import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping(value = "", produces = "application/json")
@RequiredArgsConstructor
public class Controller {

    private final GeoService geoService;


    @GetMapping("region/{name}")
    @Cacheable("getGeoInfo")
    public ResponseEntity<List<MapObject>> getGeoInfo(@PathVariable String name) {
        return ResponseEntity.ok(geoService.findGeoObjectByName(name));
    }
}
