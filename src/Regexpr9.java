import java.util.regex.Pattern;

public class Regexpr9 {
    public static void main(String[] args) {

        // Match lowercase words.
        Pattern pat = Pattern.compile("[ ,.!]");

        String strs[] = pat.split("one two,alpha9 12!done.");

        for(int i=0; i < strs.length; i++)
            System.out.println("Next token: " + strs[i]);

    }
}
