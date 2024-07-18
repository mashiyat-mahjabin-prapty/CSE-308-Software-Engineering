package Problem_2;

import Problem_2.Font.Font;
import Problem_2.Font.FontFactory;
import Problem_2.Language.Language;
import Problem_2.Language.LanguageFactory;

public class Editor {
    private static Editor instance;
    private Language language;
    private Font font;

    private Editor()
    {

    }

    public static Editor getInstance()
    {
        if(instance == null)
        {
            instance = new Editor();
        }
        return instance;
    }

    public void setLanguage(String lang)
    {
        LanguageFactory langFact =  new LanguageFactory();
        language = langFact.getLanguage(lang);
        language.createLang();
        FontFactory fontFact = new FontFactory();
        font = fontFact.getFont(lang);

        System.out.println(language);
        System.out.println(font);
    }
}
