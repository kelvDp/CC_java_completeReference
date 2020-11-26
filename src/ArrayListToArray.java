import java.util.ArrayList;

public class ArrayListToArray {
    // Converting an array list into an array
    // * can be quicker to process than array list
    // * some legacy code cannot work with array lists, only arrays

    public static void main(String[] args) {
        // create an arraylist
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        // Get the normal array
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        // sum the array
        int sum = 0;
        for (int i : ia) sum += i;

        System.out.println("Sum = " + sum);
    }
}
