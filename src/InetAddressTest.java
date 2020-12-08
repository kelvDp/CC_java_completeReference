// The following example prints the addresses and names of the local machine
// and two Internet web sites

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress[] SW = InetAddress.getAllByName("www.nba.com");
        for (InetAddress i : SW) {
            System.out.println(i);
        }
    }
}
