package Problem_2.LanguageFontFactory;

import Problem_2.Font.Consolas;
import Problem_2.Font.Font;
import Problem_2.Language.Language;
import Problem_2.Language.Python;

public class PythonFont extends LanguageFontFactory {
    Language language;
    Font font;

    @Override
    public Language getLanguage() {
        return new Python();
    }

    @Override
    public Font getFont() {
        return new Consolas();
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
