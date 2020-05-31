package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Env.Symbol;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

/*
methodDefinition
                :
                ID LEFT_PRANSIS formalParamList RIGHT_PRANSIS COLUN TYPE LEFT_CURLY
                    expr
                RIGHT_CURLY
                ;
 */
public class MethodDefinitionTranslator extends Translator {

    public MethodDefinitionTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.MethodDefinitionContext.class);
    }

    @Override
    public Temp gen() {
        TranslatorHandler.write(
                " --=========================\n" +
                "--> MethodDefinitionStmt_Start <--\n" +
                " --=========================\n"
        );

        String methodName = parseTree.getChild(0).getText();
        String methodType = parseTree.getChild(5).getText();

        Symbol symbol = new Symbol(methodName, methodType);
        ScopeHandler.addSymbol(symbol);

        ScopeHandler.pushScope();

        TranslatorHandler.write(
                String.format("%s: ", methodName)
        );

        new FormalParamListTranslator(parseTree.getChild(2)).gen();

        Temp exprTemp = new ExprTranslator(parseTree.getChild(7)).gen();

        ScopeHandler.popScope();

        TranslatorHandler.write(
                " --=========================\n" +
                        "--> MethodDefinitionStmt_End <--\n" +
                        " --=========================\n"
        );
        return exprTemp;
    }
}
