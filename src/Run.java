import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Int on 24.05.2017.
 */
public class Run {

    public static boolean validStr(String string){

        if(string != null){
            if(string.length() == 11){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String tmp = "12 ноя 1232";

        if(validStr(tmp)){
            String str = "(\\d{2}\\s[а-я]{3}\\s\\d{4})";
            Pattern patt = Pattern.compile(str);
            Matcher mtch = patt.matcher(tmp);
            System.out.println(mtch.matches());
        }


    }

}



