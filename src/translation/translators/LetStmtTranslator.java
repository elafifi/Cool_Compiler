package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Env.ScopeHandler;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

// letStmt: LET  varDeclaration+ IN expr;
public class LetStmtTranslator extends Translator {
    public LetStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.LetStmtContext.class);
    }

    @Override
    public Temp gen() {
        TranslatorHandler.write(" --=========================\n" +
                "---------> LetStmt_Start <-----------\n" +
                " --=========================\n");
        ScopeHandler.pushScope();
        Temp exprTemp = null;

        for (int i = 0; i < parseTree.getChildCount() ; i++) {

            ParseTree child = parseTree.getChild(i);
            if (child instanceof Cool_compilerParser.VarDefinitionContext) {// varDeclaration+
                new VarDefinitionTranslator(child).gen();
            } else if (child instanceof Cool_compilerParser.ExprContext) { // expr
                exprTemp = new ExprTranslator(child).gen();
            }
        }
        ScopeHandler.popScope();

        TranslatorHandler.write(" --=========================\n" +
                "---------> LetStmt_End <-----------\n" +
                " --=========================\n");

        return exprTemp;
    }
}
