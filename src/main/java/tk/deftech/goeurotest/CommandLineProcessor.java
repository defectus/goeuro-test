package tk.deftech.goeurotest;

import org.apache.commons.cli.*;

import java.io.PrintWriter;
import java.io.StringWriter;

public class CommandLineProcessor {

    private static final Options OPTIONS = new Options();
    private static final Integer WIDTH = 80;
    private static final String HEADER = "Queries a REST endpoint and displays it as a CVS";
    private static final String SYNTAX = "java -jar GoEuroTest.jar \"CITY_NAME\"";

    public static CommandLine parseCommandLine(String[] args) {
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(OPTIONS, args);
        }
        catch (ParseException e) {
            return new CommandLine() {
            };
        }
        return cmd;
    }

    public static String extractLocation(String [] args) {
        CommandLine commandLine = parseCommandLine(args);
        if (commandLine.getArgs() != null && commandLine.getArgs().length > 0) {
            return commandLine.getArgs()[0];
        }
        throw new IllegalArgumentException("No location specified");
    }

    public static String giveHelp() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        formatter.printHelp(printWriter, WIDTH, SYNTAX, HEADER, OPTIONS, HelpFormatter.DEFAULT_LEFT_PAD,
            HelpFormatter.DEFAULT_LEFT_PAD, null, true);
        return stringWriter.toString();
    }

}
