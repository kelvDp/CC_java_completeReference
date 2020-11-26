import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    // A simple spliterator demonstration
    // better used in parallel programs etc
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // use tryAdvance() to display contents of vals
        // basicall hasNext() and next() of iterator combined
        System.out.println("Contents of vals: ");
        Spliterator<Double> split = vals.spliterator();
        while (split.tryAdvance(n -> System.out.print(n + " ")));
        System.out.println();

        // Create new list that contains sqr roots
        split = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (split.tryAdvance(n -> sqrs.add(Math.sqrt(n))));

        // Use forEachRemaining() to display contents of sqrs
        System.out.println("Contents of sqrs: ");
        split = sqrs.spliterator();
        split.forEachRemaining(n -> System.out.print(n + " "));
        System.out.println();
    }
}
