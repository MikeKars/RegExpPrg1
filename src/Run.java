import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Int on 24.05.2017.
 */
public class Run {

    public static void main(String[] args) {
        String tmp = "asdq876@dsia.com";

        String str = "[a..zA..Z]{1}\\w*@\\w+.(ru|com){1}";
        //System.out.println(str);

        Pattern patt = Pattern.compile(str);

        Matcher mtch = patt.matcher(tmp);

        System.out.println(mtch.matches());


    }

}



