package Problem_2.LanguageFontFactory;

import Problem_2.Font.Font;
import Problem_2.Language.Language;

abstract public class LanguageFontFactory {
    abstract public Language getLanguage();
    abstract public Font getFont();
    abstract public void createLanuageFont();
    abstract public String toString();
}
