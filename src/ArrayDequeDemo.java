import java.util.ArrayDeque;

public class ArrayDequeDemo {
    // Demonstrate an array deque
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();

        // Use like a stack (f-i-l-o)
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Popping the stack: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }

        System.out.println();
    }
}
