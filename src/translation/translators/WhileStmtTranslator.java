package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

// whileStmt : WHILE expr THEN expr POOL;
public class WhileStmtTranslator extends Translator {
    public WhileStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.WhileStmtContext.class);
    }

    @Override
    public Temp gen() {

        TranslatorHandler.write(" --=========================\n" +
                "---------> WhileStmt_Start <-----------\n" +
                " --=========================\n");

        String beforeLabel = TranslatorHandler.getNewLabel();
        String afterLabel = TranslatorHandler.getNewLabel();

        TranslatorHandler.write(beforeLabel + ":");
        Temp whileConditionExpr = new ExprTranslator(parseTree.getChild(1)).gen();

        TranslatorHandler.write(String.format(
                "IFZ %s GOTO %s",
                whileConditionExpr,
                afterLabel

        ));

        Temp whileBodyExpr = new ExprTranslator(parseTree.getChild(3)).gen();

        TranslatorHandler.write(String.format("GOTO %s", beforeLabel));
        TranslatorHandler.write(afterLabel + ":");

        TranslatorHandler.write(" --=========================\n" +
                "---------> WhileStmt_End <-----------\n" +
                " --=========================\n");

        return whileBodyExpr;
    }
}
