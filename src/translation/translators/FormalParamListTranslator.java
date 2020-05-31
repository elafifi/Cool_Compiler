package translation.translators;


import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;

/*
formalParamList: param (COMMA param)*;
param : ID COLUN TYPE;
 */
public class FormalParamListTranslator extends Translator {
    public FormalParamListTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.FormalParamListContext.class);
    }

    @Override
    public Temp gen() {

        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof Cool_compilerParser.ParamContext) {
                String paramName = child.getChild(0).getText();
                String paramType = child.getChild(2).getText();

                Symbol symbol = new Symbol(paramName, paramType);
                ScopeHandler.addSymbol(symbol);

            }
        }
        return null;
    }
}
