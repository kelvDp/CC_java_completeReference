import java.util.LinkedList;
import java.util.List;

public class MailingList {
    public static void main(String[] args) {
        List<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W West", "11 Oak Ave", "Urbana", "IL", "6184"));
        ml.add(new Address("Ralph Baker", "114 Maple Lane", "Mahomet", "IL", "6184"));
        ml.add(new Address("Tom Carlton", "869 Elm Ave", "Champaign", "IL", "6184"));

        // Display the mailing list
        for (Address element : ml) {
            System.out.println(element);
        }
    }
}

class Address {
    private final String name;
    private final String street;
    private final String city;
    private final String state;
    private final String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return (name + "\n" + street + "\n" + city + "\n" + state + "\n" + code);
    }
}