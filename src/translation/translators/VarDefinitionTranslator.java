package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

public class VarDefinitionTranslator  extends Translator {

    public VarDefinitionTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.VarDefinitionContext.class);
    }

    @Override
    public Temp gen() {

        String varName = parseTree.getChild(0).getText();
        String type = parseTree.getChild(2).getText();

        Symbol symbol = new Symbol(varName, type);
        ScopeHandler.addSymbol(symbol);

        String exprStr;
        if (parseTree.getChildCount() > 4) { // [varName: type;] childCount = 4 , but [varName: type <- expr;] childCount = 6
            ParseTree exprNode = parseTree.getChild(4);

            Temp exprTemp = new ExprTranslator(exprNode).gen();

            TranslatorHandler.write(
                    String.format(
                            "%s := %s",
                            varName,
                            exprTemp
                    )
            );
        }
        return null;
    }
}
