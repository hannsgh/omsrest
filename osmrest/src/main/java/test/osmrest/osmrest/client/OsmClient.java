package test.osmrest.osmrest.client;

import test.osmrest.osmrest.client.model.MapObject;

import java.util.List;

public interface OsmClient {

    List<MapObject> getMapObjectElementByName(String name);

}





