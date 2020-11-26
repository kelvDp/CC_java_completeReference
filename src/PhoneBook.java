// A simple telephone number database that uses
// a property list

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Try to open phonebook.dat file
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignore missing files
        }

        // If phonebook already exists, load numbers
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // let user enter new names and numbers
        do {
            System.out.println("Enter new name ('quit' to stop): ");
            name = br.readLine();

            if (name.equalsIgnoreCase("quit")) {
                continue;
            }

            System.out.println("Enter number: ");
            number = br.readLine();

            ht.setProperty(name, number);
            changed = true;
        } while (!name.equalsIgnoreCase("quit"));

        // If phonebook data has changed, save it
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Telephone Book");
            fout.close();
        }

        // look up numbers given a name
        do {
            System.out.println("Enter a name to find ('quit' to quit): ");
            name = br.readLine();
            if (name.equalsIgnoreCase("quit")) {
                continue;
            }

            number = ht.getProperty(name);
            System.out.println(number);
        } while (!name.equalsIgnoreCase("quit"));
    }
}
