/*
 * This program sums a list of numbers entered
 * by the user. It then converts the string representation
 * of each number into an int using parseInt().
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        // create a buffered reader using system.in

        String str;
        int i;
        int sum = 0;

        System.out.println("Enter numbers, 0 to quit.");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                str = br.readLine();
                i = Integer.parseInt(str);

                sum += i;
                System.out.println("Current sum is: " + sum);
            } while (i != 0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
            i = 0;
        }
    }
}
