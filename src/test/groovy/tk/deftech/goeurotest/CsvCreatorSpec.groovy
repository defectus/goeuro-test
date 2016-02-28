package tk.deftech.goeurotest

import spock.lang.Specification

class CsvCreatorSpec extends Specification {

    void "geoData can be converted to Csv"() {
        when:
            String result = new CsvCreator().geoDataToCsv(INPUT)
        then:
            result == EXPECTED_RESULT
    }

    void "exception thrown if no data"() {
        when:
            new CsvCreator().geoDataToCsv(null)
        then:
            thrown(RuntimeException)
    }

    static final List<GeoOutputData> INPUT = [
        new GeoOutputData(_id: 1,
            name: "name1",
            type: "type1",
            latitude: 1d,
            longitude: 1d)
    ]

    static final String EXPECTED_RESULT = "\"_id\",name,type,latitude,longitude\r\n" +
        "1,name1,type1,1.0,1.0\r\n"
}
