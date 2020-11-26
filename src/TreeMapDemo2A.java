import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        // use thenComparing() to sort by last, then first name.
        Comparator<String> compLastName = (a, b) -> {
            int i, j;
            // find index of begin of last name
            i = a.lastIndexOf(' ');
            j = b.lastIndexOf(' ');
            return a.substring(i).compareToIgnoreCase(b.substring(j));
        };

        // Sort by entire name when last names are equal
        Comparator<String> compFirstName = (a, b) -> a.compareToIgnoreCase(b);

        TreeMap<String, Double> tm = new TreeMap<>(compLastName.thenComparing(compFirstName));

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
