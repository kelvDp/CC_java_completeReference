import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {

        String in = "Name: Tom Age: 28 ID: 77";
        Scanner conin = new Scanner(in);

        // find and display age
        conin.findInLine("Age:"); // find age

        if (conin.hasNext()) {
            System.out.println(conin.next());
        } else {
            System.out.println("Error!");
        }

        conin.close();
    }
}
