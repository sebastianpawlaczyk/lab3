package date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator
{
    private static String DATEREGEX31 =
            "(0[13578]|1[02])\\/" + // MM
            "(0[1-9]|1\\d|3[01])\\/" + // DD

            "\\d\\d"; // YY

    private static String DATEREGEX30 =
            "(0[469]|11)\\/" + // MM
            "(0[1-9]|1\\d|30)\\/" + // DD
            "\\d\\d"; // YY

    private static String DATEREGEXLEAP =
            "02\\/" + // MM
            "29\\/" + // DD
            "(([02468][048])|([13579][26]))"; // YY

    private static String DATEREGEXNOTLEAP =
            "02\\/" + // MM
            "(0[1-9]|1[0-9]|2[0-8])\\/" + // DD
            "\\d\\d"; // YY

    public static boolean isDateValidate(String s)
    {
        Pattern pattern = Pattern.compile(DATEREGEX31);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches())
        {
            return true;
        }

        pattern = Pattern.compile(DATEREGEX30);
        matcher = pattern.matcher(s);
        if (matcher.matches())
        {
            return true;
        }

        pattern = Pattern.compile(DATEREGEXLEAP);
        matcher = pattern.matcher(s);
        if (matcher.matches())
        {
            return true;
        }

        pattern = Pattern.compile(DATEREGEXNOTLEAP);
        matcher = pattern.matcher(s);
        if (matcher.matches())
        {
            return true;
        }

        return false;
    }
}
