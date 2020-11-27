import java.util.StringTokenizer;

public class STDemo {

    static String input = "title=Java: The Complete Reference;" + "author=Schildt;"
            + "publisher=Oracle Press;" + "copyright=2019";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(input, "=;");

        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
