// following example puts into action the features of the HTTP Client API
// just described. It demonstrates the sending of a request, displaying the body of
// the response, and obtaining a list of the response headers

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {

        // obtain a client that uses default settings
        HttpClient myHC = HttpClient.newHttpClient();

        // create a request
        HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com/")).build();

        // send request and get response,
        // InputStream is used for the body
        HttpResponse<InputStream> myResp = myHC.send(myReq, HttpResponse.BodyHandlers.ofInputStream());

        // display response code and request method
        System.out.println("Response code is " + myResp.statusCode());
        System.out.println("Request metod is " + myReq.method());

        // get headers from response
        HttpHeaders hdrs = myResp.headers();

        // get a map of the headers
        Map<String, List<String>> hdrsMap = hdrs.map();
        Set<String> hdrsField = hdrsMap.keySet();

        System.out.println("\nHere are the headers: ");

        // display all header keys and values
        for (String k : hdrsField) {
            System.out.println("Key: " + k + ", Values: " + hdrsMap.get(k));
        }

        // display the body
        System.out.println("\nHere is the body");

        InputStream in = myResp.body();
        int c;

        // read and display the entire body
        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }
    }
}
