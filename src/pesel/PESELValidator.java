package pesel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELValidator
{
    private static String PESELREGEX = "(\\d{11})";

    public static boolean isPESELValidate(String s)
    {
        Pattern pattern = Pattern.compile(PESELREGEX);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
