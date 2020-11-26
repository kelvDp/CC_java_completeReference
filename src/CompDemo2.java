import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> o2.compareTo(o1)); // sets the comparison order of set
        // or ...new TreeSet<>(Comparator.reverseOrder());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Display the elements
        for (String s : ts) {
            System.out.print(s + " ");
        }

        System.out.println();
    }
}
