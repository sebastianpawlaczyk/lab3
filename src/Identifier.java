import date.DateValidator;
import time.TimeValidator;
import ip.IPValidator;
import pesel.PESELValidator;

public class Identifier
{
    private String toIdentify;

    private void setDefaultToIdentify()
    {
        toIdentify = "toIdentify";
    }

    public Identifier()
    {
        setDefaultToIdentify();
    }

    public void setToIdentify(String s)
    {
        toIdentify = s;
    }

    public String checkType()
    {
        if (PESELValidator.isPESELValidate(toIdentify))
        {
            return Type.getString(Type.PESEL);
        }

        if (IPValidator.isIPValidate(toIdentify))
        {
            return Type.getString(Type.IP);
        }

        if (TimeValidator.isTimeValidate(toIdentify))
        {
            return Type.getString(Type.TIME);
        }

        if (DateValidator.isDateValidate(toIdentify))
        {
            return Type.getString(Type.DATE);
        }

        return Type.getString(Type.NOTRECOGNIZED);
    }

    public static void main(String args[])
    {
        Identifier identifier = new Identifier();
        identifier.setToIdentify("02/29/40");
        System.out.println(identifier.checkType());
    }
}
