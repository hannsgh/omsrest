
package test.osmrest.osmrest.client.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Geojson implements Serializable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coordinates")
    @Expose
    private List<List<List<List<Double>>>> coordinates = null;
    private final static long serialVersionUID = 3459201797999517313L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Geojson() {
    }

    /**
     * 
     * @param coordinates
     * @param type
     */
    public Geojson(String type, List<List<List<List<Double>>>> coordinates) {
        super();
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geojson withType(String type) {
        this.type = type;
        return this;
    }

    public List<List<List<List<Double>>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    public Geojson withCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Geojson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null)?"<null>":this.coordinates));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geojson) == false) {
            return false;
        }
        Geojson rhs = ((Geojson) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.coordinates == rhs.coordinates)||((this.coordinates!= null)&&this.coordinates.equals(rhs.coordinates))));
    }

}
