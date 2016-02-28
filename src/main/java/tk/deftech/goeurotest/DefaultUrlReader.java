package tk.deftech.goeurotest;

/**
 * Issues HTTP Get and returns response as a text
 */
public class DefaultUrlReader implements UrlReader {

    /**
     * resds a URL and returns a string if successful
     * @param baseUrl base URL
     * @param location location element
     * @return text at the given URL
     */
    public String readLocationJson(String baseUrl, String location) {
        return readUrl(assureTrailingSlash(baseUrl) + location);
    }

    /**
     * Makes sure the provided string ends with a forward slash
     * @param url string that may end with a slash
     * @return string that ends with a slash
     */
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
