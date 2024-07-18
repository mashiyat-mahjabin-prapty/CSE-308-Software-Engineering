package Problem_2.Font;

public class FontFactory {
    public Font getFont(String language)
    {
        if(language == null)
            return null;

        if(language.equalsIgnoreCase("py"))
        {
            return new Consolas();
        }
        else if(language.equalsIgnoreCase("c"))
        {
            return new Courier_New();
        }
        else if(language.equalsIgnoreCase("cpp"))
        {
            return new Monaco();
        }
        return null;
    }
}
