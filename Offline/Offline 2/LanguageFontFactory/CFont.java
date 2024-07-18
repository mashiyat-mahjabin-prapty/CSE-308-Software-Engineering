package Problem_2.LanguageFontFactory;

import Problem_2.Font.Courier_New;
import Problem_2.Font.Font;
import Problem_2.Language.C;
import Problem_2.Language.Language;

public class CFont extends LanguageFontFactory {
    Language language;
    Font font;

    @Override
    public Language getLanguage() {
        return new C();
    }

    @Override
    public Font getFont() {
        return new Courier_New();
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
