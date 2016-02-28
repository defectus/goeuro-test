package tk.deftech.goeurotest

import org.apache.commons.cli.CommandLine
import spock.lang.Specification

class CommandLineProcessorSpec extends Specification {
    void "processor gets the location code"() {
        when:
            CommandLine commandLine = CommandLineProcessor.parseCommandLine(CMD)
        then:
            commandLine.args.first() == "Berlin"
    }

    void "processor prints help"() {
        when:
            String help = CommandLineProcessor.giveHelp()
        then:
            help == """usage: java -jar GoEuroTest.jar "CITY_NAME"\nQueries a REST endpoint and displays it as a CVS\n\n"""
    }

    void "processor get extract location name"() {
        when:
            String location = CommandLineProcessor.extractLocation(CMD)
        then:
            location == "Berlin"
    }

    void "processor throws an exception if no location present"() {
        when:
            String location = CommandLineProcessor.extractLocation([] as String [])
        then:
            thrown(RuntimeException)
    }

    void "processor throws an exception if no input defined"() {
        when:
            String location = CommandLineProcessor.extractLocation(null)
        then:
            thrown(RuntimeException)
    }

    static final String [] CMD = ["Berlin"] as String[]
}
