package time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeValidator
{
    private static String TIMEREGEX =
            "([01]\\d|2[0-4])\\:" + // HH
            "([0-5]\\d)\\:" + // MM
            "([0-5]\\d)"; // SS

    public static boolean isTimeValidate(String s)
    {
        Pattern pattern = Pattern.compile(TIMEREGEX);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
