package Problem_2.Language;

import Problem_2.Parser.CParser;
import Problem_2.Parser.Parser;

public class C extends Language{
    String name;
    Parser parser;

    @Override
    public String getName() {
        return "C";
    }

    @Override
    public Parser getParser() {
        return new CParser();
    }

    @Override
    public String toString() {
        return "Environment: " + getName() + "\nParser: " + parser.getName();
    }

    @Override
    public void createLang() {
        name = getName();
        parser = getParser();
    }
}
