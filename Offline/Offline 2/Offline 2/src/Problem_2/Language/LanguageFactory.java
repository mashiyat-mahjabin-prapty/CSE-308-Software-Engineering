package Problem_2.Language;

public class LanguageFactory {
    public Language getLanguage(String language)
    {
        if(language == null)
            return null;

        if(language.equalsIgnoreCase("C"))
        {
            return new C();
        }
        else if(language.equalsIgnoreCase("CPP"))
        {
            return new CPP();
        }
        else if(language.equalsIgnoreCase("Py"))
        {
            return new Python();
        }
        return null;
    }
}
