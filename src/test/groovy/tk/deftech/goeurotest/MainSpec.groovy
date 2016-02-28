package tk.deftech.goeurotest

import spock.lang.Specification

class MainSpec extends Specification {

    void "passing test"() {
        when:
            1==1
        then:
            1 == 1
    }

    static final String BERLIN_INPUT = """[
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
 },

 {
 _id: 410978,
 key: null,
 name: "Potsdam",
 fullName: "Potsdam, USA",
 iata_airport_code: null,
 type: "location",
 country: "USA",

 geo_position: {
 latitude: 44.66978,
 longitude: -74.98131
 },

 location_id: 410978,
 inEurope: false,
 countryCode: "US",
 coreCountry: false,
 distance: null
 }
 ]
"""

    static final String BERLIN_OUTPUT =
        """_id, name, type, latitude, longitude
377078, Berlin, location, 52.39886, 13.06566
410978, Potsdam, location, 44.66978, -74.98131"""
}
