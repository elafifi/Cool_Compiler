package translation.translators;

import gen.Cool_compilerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;
import translation.TranslatorHandler;

//ifStmt : IF expr THEN expr ELSE expr FI;
public class IfStmtTranslator extends Translator {
    public IfStmtTranslator(ParseTree parseTree) {
        super(parseTree, Cool_compilerParser.IfStmtContext.class);
    }

    @Override
    public Temp gen() {

        TranslatorHandler.write(" --=========================\n" +
                "---------> IfStmt_Start <-----------\n" +
                " --=========================\n");

        String elseLabel = TranslatorHandler.getNewLabel();

        Temp resTemp = new Temp();

        Temp ifConditionTemp = new ExprTranslator(parseTree.getChild(1)).gen();
        TranslatorHandler.write(
                String.format(
                        "IFZ %s GOTO %s",
                        ifConditionTemp,
                        elseLabel
                )
        );

        Temp ifBodyExprTemp = new ExprTranslator(parseTree.getChild(3)).gen();

        TranslatorHandler.write(
                String.format("%s := %s", resTemp, ifBodyExprTemp)
        );
        TranslatorHandler.write(
                String.format("%s: ",elseLabel)
        );

        Temp elseBodyExprTemp = new ExprTranslator(parseTree.getChild(5)).gen();

        TranslatorHandler.write(
                String.format("%s := %s", resTemp, elseBodyExprTemp)
        );

        TranslatorHandler.write(" --=========================\n" +
                "---------> IfStmt_End <-----------\n" +
                " --=========================\n");

        return resTemp;
    }
}
