import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new MyComp()); // sets the comparison order of set

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

// A reverse comparator for a string
class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // reverse the  comparison
        return o2.compareTo(o1);
    }
}
// can also just create a natural order comparator ( o1.compareTo(o2))
// then create an instance of it in main method
// then pass the instance with a reversed method into set constructor
// i.e. TreeSet<> s = new TreeSet<>(mc.reversed());

// instead of creating a comparator class, can use a lambda expression
// Comparator<String> mc = (o1, o2) -> o1.compareTo(o2);
// then pass mc into the set constructor.