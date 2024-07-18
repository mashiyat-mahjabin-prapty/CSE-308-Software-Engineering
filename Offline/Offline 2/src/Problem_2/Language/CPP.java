package Problem_2.Language;

import Problem_2.Parser.CPPParser;
import Problem_2.Parser.Parser;

public class CPP extends Language{
    String name;
    Parser parser;

    @Override
    public String getName() {
        return "CPP";
    }

    @Override
    public Parser getParser() {
        return new CPPParser();
    }

    @Override
    public String toString() {
        return "Environment: " + getName() + "\nParser: " + getParser().getName();
    }

    @Override
    public void createLang() {
        name = getName();
        parser = getParser();
    }
}
