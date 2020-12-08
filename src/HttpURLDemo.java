// The following program demonstrates HttpURLConnection. It first
// establishes a connection to www.google.com. Then it displays the request
// method, the response code, and the response message. Finally, it displays the
// keys and values in the response header.

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {

        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        // display request method
        System.out.println("Request method is " + hpCon.getRequestMethod());

        // display response code
        System.out.println("Response code is " + hpCon.getResponseCode());

        // display response message
        System.out.println("Response message is " + hpCon.getResponseMessage());

        // get a list of the header fields and a set of the header keys
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header: ");

        // display all header keys and values
        for (String k : hdrField) {
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }
    }
}
