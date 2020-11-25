public class MemoryDemo {
    public static void main(String[] args) {
        // Demonstrate totalMemory(), freeMemory(), and gc().

        Runtime r = Runtime.getRuntime();
        long mem1, mem2;

        Integer[] someInts = new Integer[1000];

        System.out.println("Total memory is: " + r.totalMemory());

        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1);

        r.gc();

        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);

        // allocate integers
        for (int i = 0; i < 1000; i++) {
            someInts[i] = i;
        }

        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);

        System.out.println("Memory after allocation: " + (mem1 - mem2));

        // discard integers
        for (int i = 0; i < 1000; i++) {
            someInts[i] = null;
        }

        r.gc(); // request garbage collection

        mem2 = r.freeMemory();

        System.out.println("Free memory after collecting discarded integers: " + mem2);
    }
}
