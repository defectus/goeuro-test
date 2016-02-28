package tk.deftech.goeurotest;

/**
 * Data objects holding the location JSON
 */
public class GeoInputData {

    private Integer _id;
    private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    private String type;
    private String country;
    private GeoPosition geo_position;
    private Integer location_id;
    private Boolean inEurope;
    private String countryCode;
    private Boolean coreCountry;
    private Double distance;

    public static class GeoPosition {

        private Double latitude;
        private Double longitude;

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            GeoPosition that = (GeoPosition) o;

            if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) {
                return false;
            }
            return longitude != null ? longitude.equals(that.longitude) : that.longitude == null;

        }

        @Override
        public int hashCode() {
            int result = latitude != null ? latitude.hashCode() : 0;
            result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
            return result;
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
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GeoInputData that = (GeoInputData) o;

        if (_id != null ? !_id.equals(that._id) : that._id != null) {
            return false;
        }
        if (key != null ? !key.equals(that.key) : that.key != null) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) {
            return false;
        }
        if (iata_airport_code != null ? !iata_airport_code.equals(that.iata_airport_code) : that.iata_airport_code != null) {
            return false;
        }
        if (type != null ? !type.equals(that.type) : that.type != null) {
            return false;
        }
        if (country != null ? !country.equals(that.country) : that.country != null) {
            return false;
        }
        if (geo_position != null ? !geo_position.equals(that.geo_position) : that.geo_position != null) {
            return false;
        }
        if (location_id != null ? !location_id.equals(that.location_id) : that.location_id != null) {
            return false;
        }
        if (inEurope != null ? !inEurope.equals(that.inEurope) : that.inEurope != null) {
            return false;
        }
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) {
            return false;
        }
        if (coreCountry != null ? !coreCountry.equals(that.coreCountry) : that.coreCountry != null) {
            return false;
        }
        return distance != null ? distance.equals(that.distance) : that.distance == null;

    }

    @Override
    public int hashCode() {
        int result = _id != null ? _id.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (iata_airport_code != null ? iata_airport_code.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (geo_position != null ? geo_position.hashCode() : 0);
        result = 31 * result + (location_id != null ? location_id.hashCode() : 0);
        result = 31 * result + (inEurope != null ? inEurope.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (coreCountry != null ? coreCountry.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
