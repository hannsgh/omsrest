package test.osmrest.osmrest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.osmrest.osmrest.client.OsmClient;
import test.osmrest.osmrest.client.model.MapObject;
import test.osmrest.osmrest.exception.handler.exception.NoSuchRestException;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GeoServiceImpl implements GeoService {

    private final OsmClient osmClient;

    @Override
    public List<MapObject> findGeoObjectByName(String name) {
        List<MapObject> list = osmClient.getMapObjectElementByName(name);

        if (list.isEmpty()) {
            throw new NoSuchRestException("No found value " + name + " in Resource");
        }
        return list;
    }
}
