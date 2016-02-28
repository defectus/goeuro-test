package tk.deftech.goeurotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public interface UrlReader {

    default String readUrl(String urlString) {
        StringBuffer output = null;
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            output = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                output.append(inputLine);
            }
            in.close();
        }
        catch (IOException e) {
            throw new RuntimeException("unable to fetch [" + urlString + "]", e);
        }
        return output.toString();
    }
}
