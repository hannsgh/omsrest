
package test.osmrest.osmrest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.StringJoiner;


//@Generated("jsonschema2pojo")
public class MapObject implements Serializable
{

    @SerializedName("place_id")
    @Expose
    private long placeId;
    @SerializedName("licence")
    @Expose
    private String licence;
    @SerializedName("osm_type")
    @Expose
    private String osmType;
    @SerializedName("osm_id")
    @Expose
    private Long osmId;
    @SerializedName("boundingbox")
    @Expose
    private String boundingbox ;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("importance")
    @Expose
    private double importance;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("geojson")
    @Expose
    private String geojson;
    private final static long serialVersionUID = -2675531758295706834L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MapObject() {
    }

    /**
     * 
     * @param licence
     * @param boundingbox
     * @param displayName
     * @param importance
     * @param placeId
     * @param icon
     * @param lon
     * @param type
     * @param geojson
     * @param osmId
     * @param osmType
     * @param _class
     * @param lat
     */
    public MapObject(long placeId, String licence, String osmType, long osmId, String boundingbox, String lat, String lon, String displayName, String _class, String type, double importance, String icon, String geojson) {
        super();
        this.placeId = placeId;
        this.licence = licence;
        this.osmType = osmType;
        this.osmId = osmId;
        this.boundingbox = boundingbox;
        this.lat = lat;
        this.lon = lon;
        this.displayName = displayName;
        this._class = _class;
        this.type = type;
        this.importance = importance;
        this.icon = icon;
        this.geojson = geojson;
    }

    public long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(long placeId) {
        this.placeId = placeId;
    }

    public MapObject withPlaceId(long placeId) {
        this.placeId = placeId;
        return this;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public MapObject withLicence(String licence) {
        this.licence = licence;
        return this;
    }

    public String getOsmType() {
        return osmType;
    }

    public void setOsmType(String osmType) {
        this.osmType = osmType;
    }

    public MapObject withOsmType(String osmType) {
        this.osmType = osmType;
        return this;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public MapObject withOsmId(long osmId) {
        this.osmId = osmId;
        return this;
    }

    public String getBoundingbox() {
        return boundingbox;
    }

    public void setBoundingbox(String boundingbox) {
        this.boundingbox = boundingbox;
    }

    public MapObject withBoundingbox(String boundingbox) {
        this.boundingbox = boundingbox;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public MapObject withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public MapObject withLon(String lon) {
        this.lon = lon;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public MapObject withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public MapObject withClass(String _class) {
        this._class = _class;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MapObject withType(String type) {
        this.type = type;
        return this;
    }

    public double getImportance() {
        return importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    public MapObject withImportance(double importance) {
        this.importance = importance;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public MapObject withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getGeojson() {
        return geojson;
    }

    public void setGeojson(String geojson) {
        this.geojson = geojson;
    }

    public MapObject withGeojson(String geojson) {
        this.geojson = geojson;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner (", ", MapObject.class.getSimpleName () + "[", "]")
                .add ("placeId=" + placeId)
                .add ("licence='" + licence + "'")
                .add ("osmType='" + osmType + "'")
                .add ("osmId=" + osmId)
                .add ("boundingbox='" + boundingbox + "'")
                .add ("lat='" + lat + "'")
                .add ("lon='" + lon + "'")
                .add ("displayName='" + displayName + "'")
                .add ("_class='" + _class + "'")
                .add ("type='" + type + "'")
                .add ("importance=" + importance)
                .add ("icon='" + icon + "'")
                .add ("geojson='" + geojson + "'")
                .toString ();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.licence == null)? 0 :this.licence.hashCode()));
        result = ((result* 31)+((this.boundingbox == null)? 0 :this.boundingbox.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.importance)^(Double.doubleToLongBits(this.importance)>>> 32))));
        result = ((result* 31)+((int)(this.placeId^(this.placeId >>> 32))));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.lon == null)? 0 :this.lon.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.geojson == null)? 0 :this.geojson.hashCode()));
        result = ((result* 31)+((int)(this.osmId^(this.osmId >>> 32))));
        result = ((result* 31)+((this.osmType == null)? 0 :this.osmType.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MapObject) == false) {
            return false;
        }
        MapObject rhs = ((MapObject) other);
        return ((((((((((((((this.licence == rhs.licence)||((this.licence!= null)&&this.licence.equals(rhs.licence)))&&((this.boundingbox == rhs.boundingbox)||((this.boundingbox!= null)&&this.boundingbox.equals(rhs.boundingbox))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&(Double.doubleToLongBits(this.importance) == Double.doubleToLongBits(rhs.importance)))&&(this.placeId == rhs.placeId))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.lon == rhs.lon)||((this.lon!= null)&&this.lon.equals(rhs.lon))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.geojson == rhs.geojson)||((this.geojson!= null)&&this.geojson.equals(rhs.geojson))))&&(this.osmId == rhs.osmId))&&((this.osmType == rhs.osmType)||((this.osmType!= null)&&this.osmType.equals(rhs.osmType))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
    }

}
