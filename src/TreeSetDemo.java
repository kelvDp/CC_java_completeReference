/*Objects are stored in sorted,
ascending order. Access and retrieval times are quite fast, which makes
TreeSet an excellent choice when storing large amounts of sorted information
that must be found quickly.*/

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(); // stores items in a tree instead of a list

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
