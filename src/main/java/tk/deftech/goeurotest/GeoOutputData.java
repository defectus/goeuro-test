package tk.deftech.goeurotest;

/**
 * Data object holding the output model (CSV)
 */
public class GeoOutputData {

    private Integer _id;
    private String name;
    private String type;
    private Double latitude;
    private Double longitude;

    public GeoOutputData() {
        super();
    }

    public GeoOutputData(Integer _id, String name, String type) {
        this._id = _id;
        this.name = name;
        this.type = type;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoData{" +
            "_id=" + _id +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GeoOutputData that = (GeoOutputData) o;

        if (get_id() != null ? !get_id().equals(that.get_id()) : that.get_id() != null) {
            return false;
        }
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
            return false;
        }
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) {
            return false;
        }
        if (getLatitude() != null ? !getLatitude().equals(that.getLatitude()) : that.getLatitude() != null) {
            return false;
        }
        return getLongitude() != null ? getLongitude().equals(that.getLongitude()) : that.getLongitude() == null;

    }

    @Override
    public int hashCode() {
        int result = get_id() != null ? get_id().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getLatitude() != null ? getLatitude().hashCode() : 0);
        result = 31 * result + (getLongitude() != null ? getLongitude().hashCode() : 0);
        return result;
    }

    public String[] toStringArray() {
        return new String[]{
            _id == null ? "" : _id.toString(),
            name == null ? "" : name,
            type == null ? "" : type,
            latitude == null ? "" : latitude.toString(),
            longitude == null ? "" : longitude.toString(),
        };
    }
}
