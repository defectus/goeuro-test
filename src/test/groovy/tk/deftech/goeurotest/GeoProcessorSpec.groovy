package tk.deftech.goeurotest

import spock.lang.Specification

class GeoProcessorSpec extends Specification {


    void "json can be converted to a data object"() {
        when:
            List<GeoInputData> result = new GeoProcessor().parseJson(BERLIN_JSON_RECORD)
        then:
            result.first() == BERLIN_JSON_OUTPUT.first()
    }

    void "can convert input to output"() {
        when:
            GeoOutputData output = GeoProcessor.inputToOutput(BERLIN_JSON_OUTPUT.first())
        then:
            output == BERLIN_GEO_DATA
    }

    final static GeoOutputData BERLIN_GEO_DATA = new GeoOutputData(
        _id: 377078,
        name: "Potsdam",
        type: "location",
        latitude: 52.39886,
        longitude: 13.06566)

    final static String BERLIN_JSON_RECORD = """[
        {
            _id: 377078,
            key: null,
            name: "Potsdam",
            fullName: "Potsdam, Germany",
            iata_airport_code: null,
            type: "location",
            country: "Germany",

            geo_position: {
                latitude: 52.39886,
                longitude: 13.06566
            },
            location_id: 377078,
            inEurope: true,
            countryCode: "DE",
            coreCountry: true,
            distance: null
        }]
"""

    final static List<GeoInputData> BERLIN_JSON_OUTPUT = [new GeoInputData(
        _id: 377078,
        key: null,
        name: "Potsdam",
        fullName: "Potsdam, Germany",
        iata_airport_code: null,
        type: "location",
        country: "Germany",
        geo_position: new GeoInputData.GeoPosition(
            latitude: 52.39886,
            longitude: 13.06566),
        location_id: 377078,
        inEurope: true,
        countryCode: "DE",
        coreCountry: true,
        distance: null
    )]
}
