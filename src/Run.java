import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Int on 24.05.2017.
 */
public class Run {

    public static void main(String[] args) {
        String tmp = "13abc";

        String str = "(\\d+){2}[abc]{3}";
        //System.out.println(str);

        Pattern patt = Pattern.compile(str);

        Matcher mtch = patt.matcher(tmp);

        System.out.println(mtch.matches());
       // System.out.println("123".matches("\\d+"));

    }

}



