// The following example creates a URLConnection using the
// openConnection( ) method of a URL object and then uses it to examine the
// document’s properties and content:

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {

        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        // get date
        long d = hpCon.getDate();
        if (d == 0) System.out.println("No date information");
        else System.out.println("Date: " + new Date(d));

        // get content type
        System.out.println("Content-type: " + hpCon.getContentType());

        // get expiration date
        d = hpCon.getExpiration();
        if (d == 0) System.out.println("No expiration information");
        else System.out.println("Expires: " + new Date(d));

        // get last modified date
        d = hpCon.getLastModified();
        if (d == 0) System.out.println("No last-modified information");
        else System.out.println("Last-Modified: " + new Date(d));

        // get content length
        long len = hpCon.getContentLengthLong();
        if (len == -1) System.out.println("Content length unavailable");
        else System.out.println("Content-length: " + len);

        if (len != 0) {
            System.out.println("===Content===");
            InputStream in = hpCon.getInputStream();
            while ((c = in.read()) != -1) {  // returns page html
                System.out.print((char) c);
            }

            in.close();
        } else {
            System.out.println("No content available");
        }
    }
}
