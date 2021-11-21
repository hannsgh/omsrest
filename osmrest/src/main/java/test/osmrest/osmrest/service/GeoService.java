package test.osmrest.osmrest.service;

import test.osmrest.osmrest.client.model.MapObject;

import java.util.List;

public interface GeoService {

    List<MapObject> findGeoObjectByName(String name);

}
