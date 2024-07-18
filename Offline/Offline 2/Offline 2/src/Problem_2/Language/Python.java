package Problem_2.Language;

import Problem_2.Parser.Parser;
import Problem_2.Parser.PythonParser;

public class Python extends Language{
    String name;
    Parser parser;

    @Override
    public String getName() {
        return "Python";
    }

    @Override
    public Parser getParser() {
        return new PythonParser();
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
