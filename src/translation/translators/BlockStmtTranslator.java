package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

public class BlockStmtTranslator extends Translator {

    public BlockStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.BlockStmtContext.class);
    }

    @Override
    public Temp gen() {
        TranslatorHandler.write(" --=========================\n" +
                "---------> BlockStmt_Start <-----------\n" +
                " --=========================\n");

        Temp resTemp = null;

        for (int i = 0; i < parseTree.getChildCount(); i++) {

            if (parseTree.getChild(i) instanceof Cool_compilerParser.ExprContext) {
                resTemp = new ExprTranslator(parseTree.getChild(i)).gen();
            }

        }

        TranslatorHandler.write(" --=========================\n" +
                "---------> BlockStmt_End <-----------\n" +
                " --=========================\n");
        return resTemp;
    }
}
