import java.util.Properties;

public class PropDemo {
    // Demonstrate a property list
    // is an older / legacy version of a map
    // can only be strings

    public static void main(String[] args) {

//        Properties capitals = new Properties();

        // can add a default property list to search through if item is not found
        // then use deflist to construct the capitals list
        Properties defList = new Properties();
        defList.setProperty("Florida", "Tallahassee");
        defList.setProperty("Wisconsin", "Madison");

        Properties capitals = new Properties(defList);


        capitals.setProperty("Illinois", "Springfield");
        capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("Washington", "Olympia");
        capitals.setProperty("California", "Sacremento");
        capitals.setProperty("Indiana", "Indianapolis");

        // show all states and capitals
        for (Object name : capitals.keySet()) {
            System.out.println("The capital of " + name + " is " + capitals.getProperty((String) name));
        }

        System.out.println();

        // look for a state not in property list --- specify default if nothing found
        String str = capitals.getProperty("Florida", "Not Found");
//        System.out.println("The capital of florida is " + str); // will show Not Found

        System.out.println("The capital of florida is " + str);
    }
}
