package tk.deftech.goeurotest

import org.apache.commons.cli.CommandLine
import spock.lang.Specification

class CommandLineProcessorSpec extends Specification {
    void "processor gets the location code"() {
        when:
            CommandLine commandLine = CmdLine.parseCommandLine(CMD)
        then:
            commandLine.args.first() == "Berlin"
    }

    void "processor prints help"() {
        when:
            String help = CmdLine.giveHelp()
        then:
            help == """usage: java -jar GoEuroTest.jar "CITY_NAME"\nQueries a REST endpoint and displays it as a CVS\n\n"""
    }

    void "processor get extract location name"() {
        when:
            String location = CmdLine.getLocation(CMD)
        then:
            location == "Berlin"
    }

    void "processor throws an exception if no location present"() {
        when:
            String location = CmdLine.getLocation([] as String [])
        then:
            thrown(RuntimeException)
    }

    void "processor throws an exception if no input defined"() {
        when:
            String location = CmdLine.getLocation(null)
        then:
            thrown(RuntimeException)
    }

    static final String [] CMD = ["Berlin"] as String[]
}
