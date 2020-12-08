// Demonstrate DataInput - and Output Stream

import java.io.*;

public class DataIODemo {

    public static void main(String[] args) throws IOException {

        // First write the data
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("AnotherTest.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open output file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Now read the data back
        try (DataInputStream din = new DataInputStream(new FileInputStream("AnotherTest.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open the input file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
