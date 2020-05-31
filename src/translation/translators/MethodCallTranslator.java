package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

//methodCall : ID LEFT_PRANSIS actualParamList RIGHT_PRANSIS;
public class MethodCallTranslator extends Translator {

    public MethodCallTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.MethodCallContext.class);
    }

    @Override
    public Temp gen() {

        TranslatorHandler.write(" --=========================\n" +
                "---------> MethodCallStmt_Start <-----------\n" +
                " --=========================\n");
        String methodName = parseTree.getChild(0).getText();

        if (parseTree.getChildCount() > 3) {
            new ActualParamListTranslator(parseTree.getChild(2)).gen();
        }

        Symbol symbol = ScopeHandler.getSymbol(methodName);
        Temp returnVal = new Temp();
        TranslatorHandler.write(
                String.format(
                        "%s := call %s",
                        returnVal,
                        methodName
                )
        );

        TranslatorHandler.write(" --=========================\n" +
                "---------> MethodCallStmt_End <-----------\n" +
                " --=========================\n");

        return returnVal;
    }
}
