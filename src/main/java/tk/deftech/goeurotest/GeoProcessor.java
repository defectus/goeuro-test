package tk.deftech.goeurotest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Does the data processing/conversion
 */
public class GeoProcessor {

    /**
     * Reads a json and maps to the model class
     * @param json Input json
     * @return Populated model
     */
    public List<GeoInputData> parseJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<GeoInputData>>() {
        }.getType());
    }

    /**
     * Mothod converts between the input and output model
     * @param input Input model (json)
     * @return Output model (CSV)
     */
    public static GeoOutputData inputToOutput(GeoInputData input) {
        if (input == null) {
            return null;
        }
        GeoOutputData output = new GeoOutputData(input.get_id(), input.getName(), input.getType());
        if(input.getGeo_position() != null) {
            output.setLatitude(input.getGeo_position().getLatitude());
            output.setLongitude(input.getGeo_position().getLongitude());
        }
        return output;
    }
}
