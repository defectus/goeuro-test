package tk.deftech.goeurotest;

public class DefaultUrlReader implements UrlReader {

    public String readLocation(String baseUrl, String location) {
        return readUrl(assureTrailingSlash(baseUrl) + location);
    }

    public String assureTrailingSlash(String url) {
        if (url == null || url.length() == 0) {
            throw new RuntimeException("No url provided");
        }
        if (url.endsWith("/")) {
            return url;
        }
        return url + "/";
    }
}
