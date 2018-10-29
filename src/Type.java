public enum Type
{
    PESEL,
    DATE,
    TIME,
    IP,
    NOTRECOGNIZED;

    public static String getString(Type type)
    {
        switch (type)
        {
            case PESEL : return "Pesel";
            case DATE : return "Date";
            case TIME : return "Time";
            case IP : return "IPAddress";
            default : return "NotRecognized";
        }
    }
}
