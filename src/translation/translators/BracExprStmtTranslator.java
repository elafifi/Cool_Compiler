package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

//LEFT_PRANSIS expr RIGHT_PRANSIS
public class BracExprStmtTranslator extends Translator {
    public BracExprStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.BracExprStmtContext.class);
    }

    @Override
    public Temp gen() {

        Temp exprTemp = new ExprTranslator(parseTree.getChild(1)).gen();

        return exprTemp;
    }
}
