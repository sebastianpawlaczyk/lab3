package ip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator
{
    private static String IPREGEX =
            "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}" + // xxx.xxx.xxx.
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";          // xxx

    public static boolean isIPValidate(String s)
    {
        Pattern pattern = Pattern.compile(IPREGEX);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
