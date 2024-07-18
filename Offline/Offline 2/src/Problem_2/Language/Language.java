package Problem_2.Language;

import Problem_2.Parser.Parser;

abstract public class Language {
    abstract public String getName();
    abstract public Parser getParser();
    abstract public String toString();
    abstract public void createLang();
}
