import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    // Demonstrate a hash set
    // the elements stored in a hash set are not stored in sorted order
    // so output may look different than the order of input
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs); // output order will look different

        // Using a linked hash set will maintain order of items added
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");

        System.out.println(lhs); // order will be the same as input
    }
}
