package Problem_2.LanguageFontFactory;

import Problem_2.Font.Font;
import Problem_2.Font.Monaco;
import Problem_2.Language.CPP;
import Problem_2.Language.Language;

public class CPPFont extends LanguageFontFactory {
    Language language;
    Font font;


    @Override
    public Language getLanguage() {
        return new CPP();
    }

    @Override
    public Font getFont() {
        return new Monaco();
    }

    @Override
    public void createLanuageFont() {
        language = getLanguage();
        font = getFont();
    }

    @Override
    public String toString() {
        return language + "\n" + "Font: " + font.getName();
    }
}
