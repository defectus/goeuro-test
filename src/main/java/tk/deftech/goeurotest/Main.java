package tk.deftech.goeurotest;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final String BASE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

    public static void main(String[] args) {
        try {
            new Main().geoNameToCvsString(args);
        }
        catch (IllegalArgumentException e) {
            System.err.println(CommandLineProcessor.giveHelp());
            System.exit(2);
        }
        catch (Exception e) {
            System.err.println("Error processing.");
            e.printStackTrace(System.err);
            System.exit(1);
        }
        System.exit(0);
    }

    public void geoNameToCvsString(String[] args) {
        String location = CommandLineProcessor.extractLocation(args);
        String json = new DefaultUrlReader().readLocation(BASE_URL, location);
        List<GeoInputData> inputData =  new GeoProcessor().parseJson(json);
        List<GeoOutputData> outputData = inputData.stream().map(GeoProcessor::inputToOutput).collect(Collectors.toList());
        String csv = new CsvCreator().geoDataToCsv(outputData);
        System.out.println(csv);
    }
}
