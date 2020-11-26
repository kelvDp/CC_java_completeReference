import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    // The following program sorts accounts by last names
    // will use a comparator to compare last name of each account
    public static void main(String[] args) {
        Comparator<String> cmp = (stringA, stringB) -> {
            int i, j, k;

            // Find index of beginning of last name
            i = stringA.lastIndexOf(' ');
            j = stringB.lastIndexOf(' ');
            k = stringA.substring(i).compareToIgnoreCase(stringB.substring(j)); // compare last names

            if (k == 0) // then last names match, check entire name
                return stringA.compareToIgnoreCase(stringB);
            else
                return k;
        };

        // creating the tree map
        TreeMap<String, Double> tm = new TreeMap<>(cmp);

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        for (String key : tm.keySet()) {
            System.out.print(key + ": ");
            System.out.println(tm.get(key));
        }
    }
}
