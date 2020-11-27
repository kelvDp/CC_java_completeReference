import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    // Use Scanner to compute an average of the values in a file.

    public static void main(String[] args) throws IOException {

        int count = 0;
        double sum = 0.0;

        // Write  output to a file
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3,4 5 6 7,4 9,1 10,5 done");
        fout.close();

        Scanner src = new Scanner(new FileReader("test.txt"));

        // Now read ans sum numbers
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }

        src.close();
        System.out.println("Average is " + (sum / count));
    }
}
