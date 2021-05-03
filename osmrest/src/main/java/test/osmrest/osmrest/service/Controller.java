package test.osmrest.osmrest.service;

import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.osmrest.osmrest.model.MapObject;

import java.io.IOException;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static test.osmrest.osmrest.transformers.JsonArrayToJsonOfUrl.JSON_URL;


@RestController
@RequestMapping(value = "", produces = "application/json")
public class Controller {
    public static final Logger logger = LoggerFactory.getLogger (Controller.class);

    @GetMapping("test/{name}")
    @Cacheable("getGeoInfo")
    ResponseEntity
    getGeoInfo(@PathVariable String name) throws IOException {
        try {
            return getListResponseEntity (name);
        } catch (Exception e) {
            return null;
        }
    }


    private ResponseEntity<List<Map<String, String>>> getListResponseEntity(String name) {
        String mapObjectElement = JSON_URL.getMapObjectElement (name);
        Gson gson = new Gson ();
        JsonParser jsonParser = new JsonParser ();
        JsonArray jsonArray = (JsonArray) jsonParser.parse (mapObjectElement);

        // Получаем первый элемент массива json (0)
        JsonElement jsonElement = jsonArray.getAsJsonArray ().get (0);
        JsonObject jsonObject = (JsonObject) jsonElement.getAsJsonObject ();

        // Получаем place_id
        JsonElement place_id = jsonObject.get ("place_id");
        // Получаем lat
        JsonElement lat = jsonObject.get ("lat");
        // Получаем lon
        JsonElement lon = jsonObject.get ("lon");

        // Получаем display_name
        JsonElement display_name = jsonObject.get ("display_name");

        // {geojson}-> [coordinates]
        JsonElement element = gson.fromJson (jsonElement, JsonElement.class);
        JsonObject jsonObj = element.getAsJsonObject ();
        JsonElement geo = gson.fromJson (jsonObj.get ("geojson"), JsonElement.class);
        JsonObject geoobj = geo.getAsJsonObject ();
        JsonElement Coordinates = geoobj.get ("coordinates");


        MapObject mapObject = new MapObject ();
        mapObject.setPlaceId (place_id.getAsLong ());
        mapObject.setLat (String.valueOf (lat.getAsDouble ()));
        mapObject.setLon (String.valueOf (lon.getAsDouble ()));
        mapObject.setDisplayName (display_name.getAsString ());
        mapObject.setGeojson (String.valueOf (Coordinates));

        Map<String, String> centr = new HashMap<> ();

        centr.put ("lon", mapObject.getLon ());
        centr.put ("lat", mapObject.getLat ());

        Map<String, String> place_id_map = new HashMap<> ();
        place_id_map.put ("place_id", String.valueOf (mapObject.getPlaceId ()));

        Map<String, String> name_map = new HashMap<> ();
        place_id_map.put ("DisplayName", mapObject.getDisplayName ());

        Map<String, String> coordinatesmap = new HashMap<> ();
        coordinatesmap.put ("coordinates", mapObject.getGeojson ());

        List<Map<String, String>> list = new ArrayList<> ();
        list.add (place_id_map);
        list.add (name_map);
        list.add (centr);
        list.add (coordinatesmap);

        ZonedDateTime expiresDate = ZonedDateTime.now().with(LocalTime.MAX);
        String expires = expiresDate.format(DateTimeFormatter.RFC_1123_DATE_TIME);
        return ResponseEntity.ok ().header(HttpHeaders.EXPIRES, expires)
                .body (list);
    }
}










