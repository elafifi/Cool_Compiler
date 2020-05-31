package translation;

import org.antlr.v4.runtime.tree.ParseTree;

public abstract class Translator {
    protected ParseTree parseTree;
    public Translator(ParseTree parseTree, Class targetClass) {
        this.parseTree = parseTree;
    }

    public abstract Temp gen();

    public ParseTree getParseTree() {
        return parseTree;
    }
}
