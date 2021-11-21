package test.osmrest.osmrest.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import test.osmrest.osmrest.client.model.MapObject;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class OsmClientImpl implements OsmClient {

    private final String url;
    private final RestTemplate myRestTemplate;

    public List<MapObject> getMapObjectElementByName(final String name) {

        UriBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .path("/search")
                .queryParam("q", name)
                .query("country")
                .query("russia")
                .queryParam("format", "json")
                .queryParam("polygon_geojson", 1);

        final ResponseEntity<MapObject[]> forEntity = myRestTemplate.getForEntity(uriBuilder.build(), MapObject[].class);

        return Arrays.asList(forEntity.getBody());

    }
}
