package test.osmrest.osmrest.transformers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

// класс для получения [] json из URL
@Component
public class JsonArrayToJsonOfUrl {

    public static final Logger logger = LoggerFactory.getLogger(JsonArrayToJsonOfUrl.class);

    // статический экземпляр JsonArrayToJsonOfUrlService
    public static final JsonArrayToJsonOfUrl JSON_URL = new JsonArrayToJsonOfUrl ();

    public String getMapObjectElement(String name) {

        StringBuilder stringBuilder = new StringBuilder ("https://nominatim.openstreetmap.org/search");
        stringBuilder.append ("?q=");
        stringBuilder.append (name);
        stringBuilder.append ("&");
        stringBuilder.append ("country");
        stringBuilder.append ("&");
        stringBuilder.append ("russia");
        stringBuilder.append ("&");
        stringBuilder.append ("format=json");
        stringBuilder.append ("&");
        stringBuilder.append ("polygon_geojson=1");
        logger.debug("URL = " + stringBuilder);

        try (InputStream is = new java.net.URL (stringBuilder.toString ()).openStream ()) {
            String jsonObjectString = new String (is.readAllBytes ());
            logger.info("Inputstream = " + jsonObjectString);
            return jsonObjectString;

        } catch (IOException e) {
            return null;
        }

    }
}
