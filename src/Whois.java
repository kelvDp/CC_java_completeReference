/* following program provides a simple Socket example. It opens a
   connection to a "whois" port (port 43) on the InterNIC server, sends the
   command-line argument down the socket, and then prints the data that is
   returned. InterNIC will try to look up the argument as a registered Internet
   domain name, and then send back the IP address and contact information for
   that site.
*/

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws Exception {

        int c;

        // create a socket connected to internic.net, port 43
        Socket s = new Socket("whois.internic.net", 43);

        // obtain input and output streams
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Construct a request string
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";

        // convert to bytes
        byte[] buf = str.getBytes();

        // send request
        out.write(buf);

        // read and diplay response
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }

        s.close();
    }
}
/*
Here is how the program works. First, a Socket is constructed that specifies
the host name "whois.internic.net" and the port number 43. Internic.net is the
InterNIC web site that handles whois requests. Port 43 is the whois port. Next,
both input and output streams are opened on the socket. Then, a string is
constructed that contains the name of the web site you want to obtain
information about. In this case, if no web site is specified on the command line,
then "OraclePressBooks.com" is used. The string is converted into a byte array
and then sent out of the socket. The response is read by inputting from the
socket, and the results are displayed. Finally, the socket is closed, which also
closes the I/O streams.
*/