import java.util.LinkedList;

public class LinkedListDemo {
    // Demonstrate a linkedlist
    public static void main(String[] args) {

        // Create a linkedlist
        LinkedList<String> ll = new LinkedList<>();

        // Add elements to the list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Original contents of ll: " + ll);

        // Remove elements from ll
        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: " + ll);

        // Remove first and last elements
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        // Get and set values
        String val = ll.get(2);
        ll.set(2, val + " changed");

        System.out.println("ll after change: " + ll);
    }
}
