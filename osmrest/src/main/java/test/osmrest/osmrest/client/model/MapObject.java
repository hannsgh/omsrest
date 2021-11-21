
package test.osmrest.osmrest.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class MapObject {

    @JsonProperty("place_Id")
    private long placeId;
    @JsonIgnore
    private String licence;
    @JsonIgnore
    private String osmType;
    @JsonIgnore
    private Long osmId;
    @JsonIgnore
    private List<String> boundingbox;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("displayName")
    private String displayName;
    @JsonIgnore
    private String _class;
    @JsonIgnore
    private String type;
    @JsonIgnore
    private double importance;
    @JsonIgnore
    private String icon;

    @JsonProperty("geojson")
    private Object geojson;


    @JsonCreator
    public MapObject(
            @JsonProperty("place_id") final long placeId,
            @JsonProperty("lat") final String lat,
            @JsonProperty("lon") final String lon,
            @JsonProperty("display_name") final String displayName,
            @JsonProperty("geojson") final Object geojson
    ) {
        this.placeId = placeId;
        this.lat = lat;
        this.lon = lon;
        this.displayName = displayName;
        this.geojson = geojson;
    }
}
