package tk.deftech.goeurotest;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

public class CsvCreator {

    public String geoDataToCsv(List<GeoOutputData> geoData) {
        if (geoData == null || geoData.size() == 0) {
            throw new RuntimeException("No data provided");
        }
        List<String[]> data = geoData.stream().map(GeoOutputData::toStringArray).collect(Collectors.toList());
        StringWriter writer = new StringWriter();
        try {
            new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("_id", "name", "type", "latitude", "longitude"))
                .printRecords(data);
        }
        catch (IOException e) {
            throw new RuntimeException("Unable to convert to CSV", e);
        }
        return writer.toString();
    }
}
